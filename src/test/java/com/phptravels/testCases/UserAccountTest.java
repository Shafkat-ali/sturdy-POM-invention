package com.phptravels.testCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.phptravels.pages.adminAgentPage;
import com.phptravels.pages.adminLoginPage;
import com.phptravels.pages.adminUserDashboardPage;
import com.phptravels.pages.phpTravelsPage;
import com.phptravels.utilities.BaseClass;
import com.phptravels.utilities.BrowserUtilities;



@Listeners(com.phptravels.utilities.TestNGListeners.class)


public class UserAccountTest {
	
	
	phpTravelsPage phpPage = new phpTravelsPage();
	
	adminLoginPage admLogin = new adminLoginPage();
	adminUserDashboardPage admDash = new adminUserDashboardPage();
	adminAgentPage admAgent = new adminAgentPage();

	@Test
	public void deleteUsers() {

			// and login by using admin@phptravels as user name and deoadmin as password
			
		phpPage.adminLoginPageLink.click();
		BrowserUtilities.windowHandle();
		admLogin.loginEmailField.sendKeys(BaseClass.getProperty("administratorEmail"));
		admLogin.loginPasswordField.sendKeys(BaseClass.getProperty("administratorPassword"));
		admLogin.loginButton.click();
		admDash.agentButton.click();
		admAgent.deleteButton.click();
		BrowserUtilities.alerts();
		admAgent.changeSavedNotificationBar.isDisplayed();
	
	}
	
	@Test
	public void addUsers() {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
