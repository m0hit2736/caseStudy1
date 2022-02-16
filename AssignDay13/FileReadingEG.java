package AssignDay13;
import java.io.*;
public class FileReadingEG {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("file1.txt");
		while(f.read()!=-1)
		{
			char c=(char)f.read();
			System.out.print(c);
		}
		
		
		
		
	}

}
