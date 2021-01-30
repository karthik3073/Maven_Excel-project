package com.TestNG.Pratice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test {

	@Test
	@Parameters({ "username", "password" })
	public static void credentails(@Optional("karthik") String username, int password) {
		System.out.println("username:" + username);
		System.out.println("password:" + password);

	}

}
