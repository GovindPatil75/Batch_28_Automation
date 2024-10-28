package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBytextTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//  Forggotten password  -XPath By Text
		//tagname[text()='text value']
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

	}

}
