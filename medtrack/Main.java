package medtrack;

import java.util.Scanner;
import java.io.*;
import java.lang.System.*;

class Main{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int userChoice;
		
		System.out.println("To confirm that you've taken your daily prescription, ");
		System.out.println("enter a '1'. To view the log book, enter a '2'");
		userChoice = stdin.nextInt();
		
		if (userChoice == 1){
			try{
			FileWriter fw = new FileWriter("medtrack/medicinelog.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("My\n");
			
			pw.close();
			}
			catch(IOException e){
				System.out.println("Error!");
			}
		}
		else if (userChoice == 2){
			try{
			FileReader fr = new FileReader("medtrack/medicinelog.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null){
				System.out.println(str + "\n");
			}
			br.close();
			}
			catch(IOException e){
				System.out.println("File not found.");
			}
		}		
	}
}