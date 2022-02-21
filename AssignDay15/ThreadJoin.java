package AssignDay15;
class threadJoinEG extends Thread{    
	 
	public void run(){    
	  
		for(int i=1;i<=5;i++){    
			try{    
				Thread.sleep(500);    
	   }
			catch(Exception e)
			{
				System.out.println(e);
				}    
	  System.out.println("Child Thread");    
	  }    
	 }    
	  
	 }    
	  
public class ThreadJoin {
	public static void main(String args[]){    
		    
		 threadJoinEG t=new threadJoinEG();    
		 t.start();    
		 try{    
		  t.join(200);    
		 }catch(Exception e){System.out.println(e);}    
		    for(int i=0;i<4;i++)
		    {
		 System.out.println("Main Thread"); }
}
}