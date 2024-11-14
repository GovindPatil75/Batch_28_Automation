package com.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library {
	
	public static void handleDropDown(WebElement element,String value) {
		
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}

	public static int add(int a ,int b) {
		
		int c=a+b;
		return c;
	}
}
