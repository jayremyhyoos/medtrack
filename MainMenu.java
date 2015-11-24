import java.util.Scanner;
import java.io.*;
import java.lang.System.*;

class MainMenu{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Good morning! Have you taken your medicine? (Y/N) ");
		String answer = stdin.next().toLowerCase();
		if(answer == "y"){
			try{
			FileWriter fw = new FileWriter("medicinelog.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("11/24/15 -------------------- Taken");
			
			pw.close();
			}
			catch(IOException e){
				System.out.println("Error!");
			}
		}
	}
}