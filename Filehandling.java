package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName="c:\\file.txt";
		String line=null;
		
		try {
			
			FileReader filereader=new FileReader(fileName);
			BufferedReader bufferedreader=new BufferedReader(filereader);
			
			while((line=bufferedreader.readLine()) !=null) {
				System.out.println(line);
			}
			bufferedreader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error file:"+fileName);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
