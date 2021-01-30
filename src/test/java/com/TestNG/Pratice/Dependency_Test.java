package com.TestNG.Pratice;

import org.testng.annotations.Test;

public class Dependency_Test {

	@Test
	private void laptopsearch() {
		System.out.println("laptop search");
	}

	@Test
	private void mobilesearch() {
		System.out.println("mobile search");
	}

	@Test
	private void samsungSearch() {
		System.out.println("samsung search");
	}

	@Test(dependsOnMethods = "laptopsearch")
	private void offer() {
		System.out.println("offer");
	}

}
