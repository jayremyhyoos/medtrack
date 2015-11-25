import java.util.Scanner;
import java.io.*;
import java.lang.System.*;

class MainMenu{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		boolean varOne;
		String answer;
		
		System.out.print("Have you taken your medicine? (Y/N) ");
		answer = stdin.next().toLowerCase();
		System.out.println("You entered: " + answer);
		
		if (answer.equals("y")){
			try{
			FileWriter fw = new FileWriter("medicinelog.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("11/25/15 ---------------------------------------------------------- Taken");
			
			pw.close();
			}
			catch(IOException e){
				System.out.println("Error!");
			}
		}
		else{
			
		}
	}
}