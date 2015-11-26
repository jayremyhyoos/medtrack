package medtrack;

import java.io.*;
import static java.lang.System.*;

class OutWrite{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("log.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("My");
			pw.println("name");
			pw.println("is");
			pw.println("Jeremy.");
			
			pw.close();
		}
		catch(IOException e){
			out.println("Error!");
		}
	}
}