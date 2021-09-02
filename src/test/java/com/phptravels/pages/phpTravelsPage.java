package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.utilities.BaseClass;

public class phpTravelsPage {
	
	
	
	public phpTravelsPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	
	
	@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[3]")
	public WebElement adminLoginPageLink;
	
	
	
	
	
	
	
	
	
	

}
