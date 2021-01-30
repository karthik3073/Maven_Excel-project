package com.TestNG.Pratice;

import org.testng.annotations.Test;

public class Timeout_Test2 {

	// if given timeout is higher than thread value-> process executed
	@Test(timeOut = 3000)
	public static void page_load() throws Throwable {
		System.out.println("loading");
		Thread.sleep(1000);
		System.out.println("loading_completed");

	}
}
