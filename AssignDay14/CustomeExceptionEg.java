package AssignDay14;


	class InvalidAgeException  extends Exception  
	{  
	    public InvalidAgeException (String str)  
	    {  
	        super(str);  
	    }  
	}  
	    
	
	public class CustomeExceptionEg  
	{  
	   
	    static void validate (int age) throws InvalidAgeException{    
	       if(age < 18){  
	  
	        throw new InvalidAgeException("age is not valid to vote");    
	    }  
	       else {   
	        System.out.println("You can gave vote");   
	        }   
	     }    
	  
	    
	    public static void main(String args[])  
	    {  
	        try  
	        {    
	            validate(13);  
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        System.out.println("rest of the code...");    
	    }  
	}

