package com.adictin_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.filehelp.FileReaderManager;
import com.pojo_pom.Location;
import com.pojo_pom.Loginpage;
import com.pojo_pom.PageObjectManager;
import com.sample_methods.Adactin_methods;

public class Adactin_booking extends Adactin_methods {

	public static void main(String[] args) throws InterruptedException, IOException {

		getBrowsers("chrome");

		geturl("https://adactinhotelapp.com/");
		// BASE METHODS>POJO >POM
		PageObjectManager POM = new PageObjectManager(driver);
		inputtype(POM.getInstanceLog().getUsername(),FileReaderManager.instanceFRM().instanceCRM().getUsername());

		inputtype(POM.getInstanceLog().getPassword(),FileReaderManager.instanceFRM().instanceCRM().getPw() );

		login(POM.getInstanceLog().getLogin());

		dropDown(POM.getInstanceLoc().getLocation(), "value", "London");

		dropDown(POM.getInstanceLoc().getHotels(), "value", "Hotel Sunshine");
		dropDown(POM.getInstanceLoc().getRoom_type(), "value", "Double");
	}

}
