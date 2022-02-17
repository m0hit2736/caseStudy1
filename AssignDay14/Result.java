package AssignDay14;

public class Result {
	   
	    public static void validMarks(int Marks) {  
	        if(Marks<33) {  
	             
	            throw new ArithmeticException("Sorry!! You are fail");    
	        }  
	        else {  
	            System.out.println("Congratulations!! You Are Pass");  
	        }  
	    }  
	    
	    public static void main(String args[]){  
	          
	        validMarks(30);  
	        System.out.println("rest of the code...");    
	  }    
	}    
