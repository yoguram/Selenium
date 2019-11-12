package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class Leads extends SeleniumBase{
	public CreateLead clickCreateLead ()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
	}

}
