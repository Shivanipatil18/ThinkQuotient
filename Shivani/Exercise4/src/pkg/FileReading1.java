package pkg;

import java.io.FileReader;

public class FileReading1 {
	
	  public static void main(String[] args){
		  
		  try{
			  int c;
			  FileReader r = new FileReader("E:\\data.txt");
			  while((c=r.read())!=-1) {
				  System.out.print((char)c);
			  }
			  r.close();
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
	

		  
	}

}
