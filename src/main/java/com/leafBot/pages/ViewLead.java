package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;
public class ViewLead extends SeleniumBase{
	public void verify()
	{
		WebElement firstname = driver.findElementById("viewLead_firstName_sp");
		String name = firstname.getText();
		if (name.contains("Ram")) {
			System.out.println("Verified");
		} else {
			System.out.println("Check the name");
		}
}
}
