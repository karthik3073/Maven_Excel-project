package com.TestNG.Pratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Method {

	@BeforeSuite
	public static void setProperty() {
		System.out.println("Set Property");

	}

	@BeforeTest
	public static void browserLaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	public static void url() {
		System.out.println("url");
	}

	@BeforeMethod
	public static void login() {
		System.out.println("login");
	}

	@Test
	public static void laptopSearch() {
		System.out.println("LaptopSearch");
	}

	@Test
	public static void mobileSearch() {
		System.out.println("mobileSearch");
	}

	@AfterMethod
	public static void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	public static void verifyHomepage() {
		System.out.println("verifyHomepage");
	}

	@AfterTest
	public static void browserClose() {
		System.out.println("browserClose");

	}

	@AfterSuite
	public static void deleteAllCookies() {
		System.out.println("delete AllCookies");
	}

}
