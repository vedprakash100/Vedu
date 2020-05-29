package com.generics.MavenActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;
public void selectByVisibletext(WebElement element,String text)
{
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
	}
	public void selectByValue(WebElement element,String value) 
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}	
		public void selectByIndex(WebElement element,String index) 
	
	{
		Select sel=new Select(element);
		sel.selectByValue(index);
	}	
	public void contextClick(WebDriver driver, WebElement onElement) 
	{
	Actions act=new Actions(driver);
		act.contextClick(onElement).perform();
	}	
	
}	
		
		
	
