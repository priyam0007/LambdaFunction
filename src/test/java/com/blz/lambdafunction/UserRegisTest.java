package com.blz.lambdafunction;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegisTest {
	UserRegistration validator = new UserRegistration();

	// Test cases to validate First Name and Last Name.
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		String FirstName = "Fatha";
		assertTrue(validator.Name(FirstName));
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		String FirstName = "Fa";
		assertFalse(validator.Name(FirstName));
	}

	// Test cases to validate Email
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		String emailid = "mfjkd@bl.co";
		assertTrue(validator.Email(emailid));
	}

	@Test
	public void givenEmail_WhenShort_ShouldReturnFalse() {
		String emailid = "mfjkd77@bl.co";
		assertFalse(validator.Email(emailid));
	}

	// Test cases to validate Phone number
	@Test
	public void givenNumber_WhenValid_ShouldReturnTrue() {
		String phonenum = "91 1234567890";
		assertFalse(validator.Email(phonenum));
	}

	@Test
	public void givenNumber_WhenNotValid_ShouldReturnFalse() {
		String phonenum = "1234567890";
		assertFalse(validator.Email(phonenum));
	}

	// // Test cases to validate Password
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		String passWord = "Abcd1234$";
		assertTrue(validator.password(passWord));
	}

	@Test
	public void givenPassword_WhenNotValid_ShouldReturnFalse() {
		String passWord = "Abcdefgh";
		assertFalse(validator.password(passWord));
	}
}
