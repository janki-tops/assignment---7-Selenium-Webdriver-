package com.Junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;

public class facebook_paramete {

	@ParameterizedTest
	//@CsvSource({"username1, password1", "username2, password2"})


public void testFacebooklogin(String username, String password){
	boolean loginSuccess=performFacebooklogin(username,password);
	assertTrue(loginSuccess, "Login failed for username : "+ username); 

}

	private boolean performFacebooklogin(String username, String password) {
	
		return true;
	}
}
