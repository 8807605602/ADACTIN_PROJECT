package com.sample_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_methods {
	public static WebDriver driver;

	public static WebDriver getBrowsers(String browser) {
		browser.equalsIgnoreCase("chrome");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vike\\eclipse-workspace\\Selinum\\Driver\\Newchromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public static void login(WebElement press) {
		press.click();

	}

	protected static void inputtype(WebElement element, String value) {
		element.sendKeys(value);
	}

	// driver.get("https://adactinhotelapp.com/");
	public static void geturl(String url) {
		driver.get(url);
	}

	public static void dropDown(WebElement element, String type, String value) {
		Select d = new Select(element);
		if (type.equalsIgnoreCase("visibletext")) {
			d.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("value")) {
			d.selectByValue(value);
		} else if (type.equalsIgnoreCase("index")) {
			int index_value = Integer.parseInt(value);
			d.selectByIndex(index_value);
		}

	}

}
