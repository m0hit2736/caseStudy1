package AssignDay13;
import java.io.*;
public class DEMOFileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("file1.txt");
		
		f.createNewFile();
		System.out.println("File is created");
	}

}
