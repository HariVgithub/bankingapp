package signupAndsingin;

import java.util.Scanner;

public class Signin_Signup {
		public static void main(String[] args) throws Exception {
			Scanner s=new Scanner(System.in);
			System.out.println("Signin or Signup");
			String res=s.next().toLowerCase();
			if(res.equals("signin")) {
				Signin.signin();
			}
			else if(res.equals("signup")) {
				Signup.signup();
			}
			else {
				System.out.println("Invalid Operation...");
			}
		}
}
