package com.TestNG.Pratice;

import org.testng.annotations.Test;

public class Grouping_Test {

	@Test(groups = "Electronics")
	private void mobileSearch() {
		System.out.println("mobile Search");
	}

	@Test(groups = "Electronics")
	private void earphones() {
		System.out.println("earphones");

	}

	@Test(groups = "Electronics")
	private void mobilecharger() {
		System.out.println("mobilecharger");
	}

	@Test(groups = "Books")
	private void dictionary() {
		System.out.println("dictionary");
	}

	@Test(groups = "Books")
	private void novel() {
		System.out.println("novel");
	}

}