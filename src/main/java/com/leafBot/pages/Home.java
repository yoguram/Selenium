package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class Home extends SeleniumBase{
	public MyHome clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHome();
	}

}
