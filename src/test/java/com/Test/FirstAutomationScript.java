package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationScript {

	public static void main(String[] args) {
		
	// Browser executable setup
		WebDriverManager.chromedriver().setup();
		
	//Create the object of Browser driver class
		ChromeDriver driver=new ChromeDriver();
		
   // Browser open --Url
		driver.get("https://automationexercise.com/test_cases");
		
		
		//Edge
		// Browser executable setup
		WebDriverManager.edgedriver().setup();
		//Create the object of Browser driver class
		EdgeDriver driver1=new EdgeDriver();
		
		driver1.get("https://automationexercise.com/test_cases");
		
		
	}

}
