package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.utilities.BaseClass;

public class adminLoginPage {
	
	
	
	
	
public adminLoginPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	
	
	@FindBy(xpath="(//*[@placeholder='Email'])[1]")
	public WebElement loginEmailField;
	
	
	
	@FindBy(xpath="(//*[@placeholder='Password'])[1]")
	public WebElement loginPasswordField;
	
	
	@FindBy(xpath="//*[@class='btn btn-primary btn-block ladda-button fadeIn animated btn-lg']")
	public WebElement loginButton;
	
	
	
	
	
	
	
	
	

}
