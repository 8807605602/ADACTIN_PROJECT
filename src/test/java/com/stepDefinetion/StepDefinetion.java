package com.stepDefinetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.filehelp.FileReaderManager;
import com.pojo_pom.PageObjectManager;
import com.runner.Runner_class;
import com.sample_methods.Adactin_methods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinetion extends Adactin_methods {
	public static WebDriver driver= Runner_class.driver;
	PageObjectManager POM = new PageObjectManager(driver);


@Given("^user in launch the browsers$")
public void user_in_launch_the_browsers() throws Throwable {
	geturl("https://adactinhotelapp.com/");

}

@When("^user enter the username in username field$")
public void user_enter_the_username_in_username_field() throws Throwable {
	inputtype(POM.getInstanceLog().getUsername(),FileReaderManager.instanceFRM().instanceCRM().getUsername());

}

@When("^user enter the password into password field$")
public void user_enter_the_password_into_password_field() throws Throwable {
	inputtype(POM.getInstanceLog().getPassword(),FileReaderManager.instanceFRM().instanceCRM().getPw() );

}
@Then("^user click the submit button$")
public void user_click_the_submit_button() throws Throwable {
	login(POM.getInstanceLog().getLogin());
}


	@Given("^click  the select location drop down to location selection selection$")
	public void click_the_select_location_drop_down_to_location_selection_selection() throws Throwable {
		dropDown(POM.getInstanceLoc().getLocation(), "value", "London");
	}

	@When("^click  the hotel drop down to holel selection$")
	public void click_the_hotel_drop_down_to_holel_selection() throws Throwable {
		dropDown(POM.getInstanceLoc().getHotels(), "value", "Hotel Sunshine");

	}

	@Then("^click  the hotel type  drop down to holel selection$")
	public void click_the_hotel_type_drop_down_to_holel_selection() throws Throwable {
		dropDown(POM.getInstanceLoc().getRoom_type(), "value", "Double");
Thread.sleep(3000);
	}

	
	@Given("^click  the change pw field to for password change$")
	public void click_the_change_pw_field_to_for_password_change() throws Throwable {
	 driver.findElement(By.linkText("Change Password")).click();
	}

}


