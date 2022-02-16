package AssignDay13;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class FileFolderEg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("file2.txt");
		Scanner sc = new Scanner(System.in);  
	      String path = sc.next();  
	      
	      System.out.println("Enter the name of the desired a directory: ");  
	      path = path+sc.next();  
	        
	      
	      
		f.createNewFile();
		
		File f1=new File(path);
		boolean b=f1.mkdir();
				if(b){  
	         System.out.println("Folder is created successfully");  
	      }else{  
	         System.out.println("Error Found!");  
	      } 
		System.out.println("File is created");
	}

}
