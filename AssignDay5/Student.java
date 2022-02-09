
public class Student {
	String name="";
	int id;
	public void display(String n, int ide)
	{
		name=n;
		id=ide;
	}
public static void main(String args[])
{
	Student s=new Student();
	s.display("Mohit",25);
	System.out.println(s.name+" "+s.id);
	
}
}
