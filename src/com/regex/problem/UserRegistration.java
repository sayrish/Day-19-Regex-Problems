package com.regex.problem;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean userName(String regex , String input) {
		return Pattern.compile(regex).matcher(input).matches();
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Name :");
			String firstName = "^[A-Z]{1}[a-z]{2,}$";
			String input = sc.next(); //Kapil = true // kapil = false //
			UserRegistration ur = new UserRegistration();
			System.out.println(ur.userName(firstName, input));
		}

	}



}
