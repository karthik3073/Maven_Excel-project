package com.TestNG.Pratice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Validation1 {

	@Test
	private void validation() {

		String actual = "karthik";

		String expected = "gowthami";

//		assertEquals(actual, expected); //

//		assertNotEquals(actual, expected);

//		assertSame(actual, expected);

//		assertNull(actual);

//		assertNotNull(expected);

		int age = 20;

		assertTrue(age >= 23);

		assertFalse(age >= 23);
	}

}
