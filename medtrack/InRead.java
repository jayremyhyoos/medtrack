package medtrack;

import java.io.*;
import java.lang.System.*;

class InRead{
	public static void main(String[] args){
		try{
			FileReader fr = new FileReader("log.txt");
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