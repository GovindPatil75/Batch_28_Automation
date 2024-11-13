package com.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
        //How to handle dropdown
        
        WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
        
        Select select=new Select(country);
        
       // select.selectByIndex(10);
        
       // select.selectByValue("BAHRAIN");
        
        select.selectByVisibleText("INDIA");
	}

}
