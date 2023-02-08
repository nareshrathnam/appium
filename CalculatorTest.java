package com.test.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;


	public static void main(String[] args) {
		{
			try {
				openCalculator();
			} catch (Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}
		}

	}

	private static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Naresh Redmi");
		cap.setCapability("udid", "241ca882");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");

		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL url = new URL("http://0.0.0.0:4724/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);

		System.out.println("started..");

	}

}
