package com.pojo_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location {
	private WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room_type;

	public Location(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}

	

	public WebElement getRoom_type() {
		return room_type;
	}


	}

		

