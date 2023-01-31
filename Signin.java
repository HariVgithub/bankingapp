package signupAndsingin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Signin {
     public static void signin() throws Exception {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter Email Id :");
    	String email=s.next();
    	System.out.println("Enter password :");
    	String password=s.next().toLowerCase();
    	Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mydatabase?user=root&password=karthi";
		Connection con =DriverManager.getConnection(url);
		Statement stmt=con.createStatement();
		String sQuery="select * from user where emailid='"+email+"'";
		ResultSet rs=stmt.executeQuery(sQuery);
		if(rs.next()) {
				if(rs.getString(2).equals(password)) {
			System.out.println("Welcome "+rs.getString("username"));
				}
				else {
			System.out.println("Invalid password....");
				}
		}
		else {
			System.out.println("Invaild Email Id ...");
		}
		if(con!=null) {
   		 con.close();
   	 }
   	 if(stmt!=null) {
   		 stmt.close();
   	 }
     }
}
