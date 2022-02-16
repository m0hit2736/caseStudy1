package AssignDay13;
import java.io.*;
public class FIleWriteEG {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("file1.txt");
		f.write("THis is 1st file\n ");
		f.write("Mohit");
		f.write(" Gupta");
		f.write(" SKIT");
		f.write(97); //getting ascii values not integer value
		f.write(98);
		f.write(99);
		//f.close();
		System.out.println("Data is inserted");
		
		//("BufferWriter");
		
		BufferedWriter bw=new BufferedWriter(f);
		bw.write("THis is 1st file\n ");
		bw.write("Mohit");
		bw.write(" Gupta");
		bw.write(" SKIT");
		bw.write(97); //getting ascii values not integer value
		bw.write(98);
		bw.write(99);
		
		
		//(PrintWriter)
		
		
		PrintWriter pr=new PrintWriter(f);
		pr.println("welcome");
		pr.println(" to");
		pr.println(" this ");
		pr.println(" file");
		pr.println(98);
		f.close();	
	}

}
