package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        
        
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        
        //Alert -Handle 
        Alert alt=driver.switchTo().alert();
        String Textonalert=alt.getText();
        System.out.println(Textonalert);
        
        
	}

}
