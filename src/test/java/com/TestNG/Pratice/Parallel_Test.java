package com.TestNG.Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {

	public static WebDriver driver;

	//parallel having XML file. 
	//XML thread count=1- There are 4 testcases in this pgm, 1 testcase run fastly
	//rest of testcase run slowly
	@Test
	private void amazon() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

	}

	@Test
	private void google() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

	}

}
