package com.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationSession_LocatorID_Name {

	public static void main(String[] args) {
		
		//Open Browser and Launch Application Url
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        //Enter valid Email Id
        //WebElement --Identify Locator -ID/Name
        
        WebElement Email=driver.findElement(By.id("email"));
        Email.sendKeys("Test@gmail.com");
        
        //Enter Valid Password
        WebElement Password=driver.findElement(By.name("pass"));
        Password.sendKeys("12345678");
        
        //Click on login button
        // org.openqa.selenium.NoSuchElementException
        //WebElement LoginBtn=driver.findElement(By.id("u_0_9_up"));
       // LoginBtn.click();
        
        WebElement LoginBtn=driver.findElement(By.name("login"));
        LoginBtn.click();
        
        //verify --->Homepage title
        String ActualTitle=driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle="ABC";
        
        if(ExpectedTitle.equals(ActualTitle)) {
        	System.out.println("Test case pass");
        }else {
        	System.out.println("Test case Fail");
        }
        
        
        
        
	}

}
