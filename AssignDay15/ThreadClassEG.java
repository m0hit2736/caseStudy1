package AssignDay15;


class MyThread extends Thread{
	public void run()
	{
		
			System.out.println("Child thread");
			
	}
		/*public void start()
		{
			System.out.println("Start");
			run();
		}*/
	
}
public class ThreadClassEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread mt=new MyThread();
//mt.run();
mt.start();


	System.out.println("Main Thread");
	

	}

}
