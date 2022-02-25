package AssignDay19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter You Username");
		String uname=sc.next();
		System.out.println("Enter You Password");
		String pwd=sc.next();
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/students","postgres","A@yush303");
		PreparedStatement stmt=con.prepareStatement("select * from users where username=? and password=?");
		stmt.setString(1,uname);
		stmt.setString(2, pwd);
		ResultSet result=stmt.executeQuery();
		if(result.next()) {
			System.out.println("login Succesful");
		}
		else {
			System.out.println("login denied....Please enter coreect credentials");
		}
	}

}
