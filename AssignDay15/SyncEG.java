package AssignDay15;
class SyncFirst{
	synchronized  void display(String msg)
	{
		System.out.println("["+msg+"]");
	
	try 
	{
		Thread.sleep(500);
	}
	catch(InterruptedException e) 
	{
		e.printStackTrace();
	}
}
}
class SyncSecond extends Thread{
	String msg;
	SyncFirst obj;
	SyncSecond(SyncFirst obj,String msg){
		this.obj=obj;
		this.msg=msg;
		this.start();	
	}
	synchronized public void run() {
		obj.display(msg);
	}
}
public class SyncEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SyncFirst f1=new SyncFirst();
SyncSecond f2=new SyncSecond(f1,"Welcome");
SyncSecond f3=new SyncSecond(f1,"to");
SyncSecond f4=new SyncSecond(f1,"java");
}

}
