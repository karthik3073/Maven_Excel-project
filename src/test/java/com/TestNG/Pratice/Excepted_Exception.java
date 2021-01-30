package com.TestNG.Pratice;

import org.testng.annotations.Test;

public class Excepted_Exception {

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public static void array_Datas() {
		int a[] = new int[2];

		a[0] = 10;
		a[1] = 20;

		System.out.println(a[22]);
	}

}
