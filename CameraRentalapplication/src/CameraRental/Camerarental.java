package CameraRental;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;



public class Camerarental {
	public static void main(String[] args) {
		double INR = 1000;
		String username, password;

		Scanner s = new Scanner(System.in);
		System.out.println("-------------------*********-------------");
		System.out.println("Welcome to Camera Rental App");
		System.out.println("-------------------***********------------");
		System.out.println("Please Login to Continue -");
		System.out.print("Enter username:");// username:Admin
		username = s.nextLine();
		System.out.print("Enter password:");// password:admin123
		password = s.nextLine();
		if (username.equals("Admin") &&password.equals("admin123")) {
			//System.out.println();
			System.out.println("\nLogin Successful!!!\n");}
	}
}
			
												