package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class first {

	public static void main(String[] args) {
		
		try (FileOutputStream fos= new FileOutputStream("d:\\handlefile(2).txt",true))
		{
				byte b[]=new byte[100];
				System.out.println("enter data");
				int k= System.in.read(b);
				fos.write(b,0,k);
				
				
			
			
		} catch(Exception ee) {
			
			ee.printStackTrace();
		}
		

	}

}
