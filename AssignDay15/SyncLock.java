package AssignDay15;

class A {

	public synchronized void d1(B b) {
		System.out.println("thread 1 satrts execution of d1() method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thread 1 trying to call B's last()method");
		b.last();

	}

	public synchronized void last() {
		System.out.println("inside A's this is last() method");
	}

}

class B {

	public synchronized void d2(A a) {
		System.out.println("thread 2 satrts execution of d2() method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println("Thread 2 trying to call A's last()method");
		a.last();
	}

	public synchronized void last() {
		System.out.println("inside B's this is last() method");
	}
}

public class SyncLock extends Thread {

	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		a.d1(b); // it is executed by the main thread

	}

	public void run() {
		b.d2(a); // this line executed by the child thrad
	}

	public static void main(String[] args) {

		SyncLock sc = new SyncLock();
		sc.m1();
	}
}