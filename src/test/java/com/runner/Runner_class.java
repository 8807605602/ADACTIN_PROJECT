package com.runner;

import javax.annotation.RegEx;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sample_methods.Adactin_methods;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\featureLogin\\Login.Feature",

glue="com\\stepDefinetion" ,monochrome = true ,strict=true ,tags = {  "@regression_run"}
,plugin = { "html:Reportsadactin/adactin" ,"pretty" ,"json:Reportsadactin/cucumber.json"
		,"com.cucumber.listener.ExtentCucumberFormatter:Reportsadactin/Final.html"})




public class Runner_class {

	
	public static WebDriver driver;
	
	//broser launch
	@BeforeClass
	public static void setup() {
driver=Adactin_methods.getBrowsers("chrome");
	}
	
	//browser close
	@AfterClass
	public static void endup() {
driver.close();
	}
}
	