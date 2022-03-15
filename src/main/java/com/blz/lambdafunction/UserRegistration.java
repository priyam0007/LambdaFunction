package com.blz.lambdafunction;

import java.util.regex.Pattern;
import java.util.Scanner;

@FunctionalInterface
interface Validation {
	boolean validate();
}

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	static UserRegistration userReg = new UserRegistration();
	private static String name = "[A-Z]+[A-Za-z]{2,}";
	private static String email = "[a-z]+([.][a-z]+)*@bl[.]co([.]in)*";
	private static String number = "91\\s[0-9]{10}";
	private static String pass = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";

	public static void main(String[] args) {

		Validation FirstName = () -> {
			System.out.println("Enter first name :: ");
			String firstName = sc.next();
			return userReg.Name(firstName);
		};
		FirstName.validate();

		Validation LastName = () -> {
			System.out.println("Enter Last name :: ");
			String lastName = sc.next();
			return userReg.Name(lastName);
		};
		LastName.validate();

		Validation Email = () -> {
			System.out.println("Enter Email ID :: ");
			String EmailId = sc.next();
			return userReg.Email(EmailId);
		};
		Email.validate();

		Validation MobNum = () -> {
			System.out.println("Enter mobile number ::");
			String n = sc.next();
			return userReg.Number(n);
		};
		MobNum.validate();

		Validation Password = () -> {
			System.out.println("Please Enter password :: ");
			String password = sc.next();
			return userReg.password(password);
		};
		Password.validate();
	}

	public boolean Name(String N) {
		boolean answer = Pattern.matches(name, N);
		try {
			if (answer) {
				System.out.println("Thank you");
				return true;
			} else {
				throw new InvalidEntryException("please enter valid First name or Last name.");
			}
		} catch (InvalidEntryException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean Email(String ID) {
		boolean answer = Pattern.matches(email, ID);
		try {
			if (answer) {
				System.out.println("Thank you");
				return true;
			} else {
				throw new InvalidEntryException("please enter valid Email ID.");
			}
		} catch (InvalidEntryException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean Number(String num) {
		boolean answer = Pattern.matches(number, num);
		try {
			if (answer) {
				System.out.println("Thank you");
				return true;
			} else {
				throw new InvalidEntryException("please enter valid Phone Number.");
			}
		} catch (InvalidEntryException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean password(String p) {
		boolean answer = Pattern.matches(pass, p);
		try {
			if (answer) {
				return true;
			} else {
				throw new InvalidEntryException("please enter valid password.");
			}
		} catch (InvalidEntryException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
