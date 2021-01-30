package com.TestNG.Pratice;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test
	public static void laptopSearch() {
		System.out.println("laptop Search");
	}

	@Test(priority = +1)
	public static void earphonesSearch() {
		System.out.println("earphones Search");
	}

	@Test(priority = 0)
	public static void mobileSearch() {
		System.out.println("mobile Search");
	}

	@Test(priority = -5)
	public static void musicSearch() {
		System.out.println("music Search");
	}
	
}
