package AssignDay15;

class MyThreadFun extends Thread{
	public void run()
	{
		
			System.out.println("Child thread");
			
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(Thread.currentThread().getName());
	}
		
	
}
public class ThreadFunEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadFun mt=new MyThreadFun();
		mt.setPriority(10);
		mt.start();

		System.out.println("Main Thread");
System.out.println(Thread.currentThread().getPriority());
		System.out.println("Before: "+Thread.currentThread().getName());
		mt.setName("mythread");
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("After: "+Thread.currentThread().getName());
	}

}
