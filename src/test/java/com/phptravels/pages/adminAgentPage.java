package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.utilities.BaseClass;

public class adminAgentPage {
	
	
	
public adminAgentPage() {
		
		
		PageFactory.initElements(BaseClass.getDriver(), this);
		
		
		
	}
	
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[10]/span/a[2]")
	public WebElement deleteButton;
	

	
	@FindBy(xpath="/html/body/div[4]/div/h4")
	public WebElement changeSavedNotificationBar;
	
	
	
}
