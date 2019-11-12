package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class MyHome extends SeleniumBase {
	public Leads clickLead()
	{
	driver.findElementByXPath("//a[text()='Leads']").click();
	return new Leads();
	}
	
}
