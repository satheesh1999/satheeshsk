package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sat {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\eclipse-workspace\\SatheeshJava\\src\\driver\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	}
	}


