package AssignDay16;

public class LambdaEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->System.out.println("Hello");
		new Thread(r).start();
	//	r.run();
	}

}
