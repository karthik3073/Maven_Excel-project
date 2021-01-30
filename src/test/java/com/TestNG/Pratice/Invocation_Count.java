package com.TestNG.Pratice;

import java.net.URL;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test
	public static void browser_launch() {
		System.out.println("browser launch");
	}

	//Number of times the method will be invoked in more than 3 times
	@Test(invocationCount = 3)
	public static void refresh() {
		System.out.println("refresh");
	}

	@Test
	public static void url() {
		System.out.println("url");

	}

}
