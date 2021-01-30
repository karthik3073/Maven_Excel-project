package com.TestNG.Pratice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concepts {

	@BeforeMethod
	public static void login() {
		System.out.println("login");
	}

	@Test
	public static void laptopSearch() {
		System.out.println("laptop Search");
	}

	@Test
	public static void mobileSearch() {
		System.out.println("mobile Search");
	}

	@Ignore
	@Test
	public static void earphonesSearch() {
		System.out.println("earphones Search");
	}

	//Ignore we can used instead of (enabled = false)
	@Test(enabled = false)
	public static void bookSearch() {
		System.out.println("book Search");
	}

	@AfterMethod
	public static void logout() {
		System.out.println("logout");
	}

}
