package com.TestNG.Pratice;

import org.testng.annotations.Test;

public class Timeout_Test1 {

	// if given timeout is lower than thread value-> it will throw thread timeout
	// exception
	@Test(timeOut = 2000)
	public static void page_load() throws Throwable {
		System.out.println("loading");
		Thread.sleep(3000);
		System.out.println("loading_completed");
	}

}
