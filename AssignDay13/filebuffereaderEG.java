package AssignDay13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filebuffereaderEG {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("file1.txt");
		BufferedReader br=new BufferedReader(f);
		String d=br.readLine();
		
		while(d!=null)
		{
			System.out.println(d);
			d=br.readLine();
		}

	}

}
