package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.leafBot.selenium.api.base.SeleniumBase;

public class Login extends SeleniumBase{
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="username")
	WebElement uName;
	public Login enterUserName()
	{
		uName.sendKeys("demosalesmanager");
		return this;
	}
	
	public Login enterPassword()
	{
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	WebElement login;
	public Home clickLogin()
	{
		login.click();
		return new Home();
	}

}
