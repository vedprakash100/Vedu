package com.pages.MavenActiTime;

import java.io.IOException;

import org.apache.poi.ss.formula.SheetNameFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTime.AutoConstatnt;
import com.generics.MavenActiTime.ExcelLibrary;

public class POMActitimeLoginpage implements AutoConstatnt {

	@FindBy(id="username")
	private WebElement usertextfieldname;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordtextfield;
	@FindBy (id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	@FindBy (id="loginButton")
	private WebElement loginButton;
	@FindBy (xpath="//a[.='Forgot your password?']")
	private WebElement Forgotyourpassword;
	@FindBy (xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTIMEInc;

public POMActitimeLoginpage (WebDriver Driver) {
	 PageFactory.initElements(Driver, this);
	}

			public void loginMethods() throws IOException
			{
				usertextfieldname.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheetname, 1,0));
				passwordtextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 1));
				loginButton.click();
			}}
	
	
  
	
