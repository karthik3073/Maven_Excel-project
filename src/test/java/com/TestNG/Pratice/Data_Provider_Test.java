package com.TestNG.Pratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	@Test(dataProvider = "test_Data")
	private void credentails(String username, int password) {
		System.out.println("username:" + username);
		System.out.println("password:" + password);

	}
//k
	@DataProvider
	private Object[][] test_Data() {
		return new Object[][] { { "Gowthami", 123 }, { "karthik", 456 }, { "Dharsha", 789 }

		};
	}
}
