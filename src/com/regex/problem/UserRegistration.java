package com.regex.problem;





import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean userName(String regex, String input) {
		return Pattern.compile(regex).matcher(input).matches();
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Name :");
			String firstName = "^[A-Z]{1}[a-z]{2,}$";
			String inputFirstName = sc.next(); // sayrish1 = true // sayrish1 = false //
			
			System.out.println("Enter Last Name :");
			String lastName = "^[A-Z]{1}[a-z]{2,}$";
			String inputLastName = sc.next();
			
			System.out.println("Enter Email id :");
			String emailId = "^[a-zA-Z]+([_+-.][a-zA-Z])+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";
			String inputEmailId = sc.next();
			
			System.out.println("Enter Mobile Number");
			String mobileNumber ="^(91)()[6-9]{1}[0-9]{9}$";
			String inputmobileNumber = sc.next();
			
			System.out.println("Enter Password");
			String password = "[A-Za-z0-9]{8}$";
			String inputPassword = sc.next(); 
			
			UserRegistration ur = new UserRegistration();
			System.out.println(ur.userName(firstName, inputFirstName));
			System.out.println(ur.userName(lastName, inputLastName));
			System.out.println(ur.userName(emailId, inputEmailId)); //abc.xyz@bl.co.in
			System.out.println(ur.userName(mobileNumber, inputmobileNumber));
			System.out.println(ur.userName(password, inputPassword));
		}

	}









}
