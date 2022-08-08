package com.pojo_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	private WebDriver driver;
	private Loginpage log;
	private Location loc;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public Loginpage getInstanceLog() {
		log = new Loginpage(driver);

		return log;
	}

	public Location getInstanceLoc() {
		loc = new Location(driver);

		return loc;
	}

}
