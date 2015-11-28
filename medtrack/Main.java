package medtrack;

import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class Main{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int userChoice;
		boolean taken = false;
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(today);
		
		System.out.println("To confirm that you've taken your daily prescription, ");
		System.out.println("enter a '1'. To view the log book, enter a '2'");
		userChoice = stdin.nextInt();
		
		if (userChoice == 1){
			try{
				FileWriter fw = new FileWriter("medicinelog.txt", true);
				FileReader fr = new FileReader("medicinelog.txt");
				BufferedReader br = new BufferedReader(fr);
				
				String str;
				while((str = br.readLine()) != null) {
					if (str.contains(date)){
						taken = true;
					}
				}
				
				if (taken){
					System.out.println("You have already entered your report for today.");
				}else{
					PrintWriter pw = new PrintWriter(fw);
					
					pw.println("Meds were taken on " + date);
					
					pw.close();
					stdin.close();
					System.out.println("Logging complete for " + date);
					}
				}
			catch(IOException e) {
				System.out.println("Exception thrown " + e);
			}
		}
		else if (userChoice == 2) {
			try{
				FileReader fr = new FileReader("medicinelog.txt");
				BufferedReader br = new BufferedReader(fr);
				
				String str;
				while((str = br.readLine()) != null) {
					System.out.println(str + "\n");
					if (str.contains(date)){
						taken = true;
					}
				}
				br.close();
				System.out.println("Todays date is: " + date);
				if (taken)
					System.out.println("You have already taken your meds today.");
				else
					System.out.println("You have not yet taken your meds today - TAKE THEM.");
				stdin.close();
				}
			catch(IOException e) {
				System.out.println("IOException thrown: " + e);
			}
		} else {
			System.out.println("You must enter either 1 or 2");
		}
	}
}
