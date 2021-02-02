package com.TestNG.Pratice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyser implements IRetryAnalyzer {

	int count = 0, limit = 5;

	public boolean retry(ITestResult result) {
		if (count < limit) {

			count++;
			return true;

		}
		return false;
	}

}
