package com.phptravels.utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserUtilities {

	public static void windowHandle() {
		// Get handles of the windows
		String mainWindowHandle = BaseClass.getDriver().getWindowHandle();
		Set<String> allWindowHandles = BaseClass.getDriver().getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the
		// heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				BaseClass.getDriver().switchTo().window(ChildWindow);
				
			}

		}
	}
	
	
	
	public static void alerts() {
		
		Alert alert = BaseClass.getDriver().switchTo().alert();
				
		alert.accept();
		
		
	}
	
	
	
	
	
	

}
