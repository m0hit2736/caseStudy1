package AssignDay15;

class MyThreadFucntion extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
			System.out.println("Child Thread");
		
		}
	}
	}
public class ThreadYieldEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadFucntion mt=new MyThreadFucntion();
		
	
		mt.start();
		
		for(int i=0;i<5;i++)
		{
			Thread.currentThread().yield();
			System.out.println("Main Thread");
		}
			
}
}
