package signupAndsingin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Signup {
	public static void signup() throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter UserName :");
		String username=s.next().toLowerCase();
		System.out.println("Enter password :");
		String password=s.next().toLowerCase();
		System.out.println("Enter Email Id :");
		String email=s.next();
		System.out.println("Enter Contact No :");
		String contactno=s.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi";
		Connection con =DriverManager.getConnection(url);
		Statement stmt=con.createStatement();
		String iQuery="insert into user values('"+username+"','"+password+"','"+email+"','"+contactno+"')";
		int nori =stmt.executeUpdate(iQuery);
		System.out.println("Sigup Completed Successfully....");
		System.out.println("you want Sigin press 1:\nyou want quit press 2:");
		int res=s.nextInt();
		if(res==1) {
			Signin.signin();
		}
		else {
			System.exit(0);
		}
		if(con!=null) {
   		 con.close();
   	 }
   	 if(stmt!=null) {
   		 stmt.close();
   	 }
	}
}
