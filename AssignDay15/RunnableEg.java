package AssignDay15;
 class MyClass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run Thread");
	}
	 
 }
public class RunnableEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass();
		Thread t=new Thread(m);
		t.start();
		System.out.println("Main Thread");
	}

}
