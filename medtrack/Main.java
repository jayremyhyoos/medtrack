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
		
		System.out.println(userChoice);
	}
}