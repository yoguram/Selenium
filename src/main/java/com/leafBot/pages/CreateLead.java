package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLead extends SeleniumBase{
	public CreateLead enterFirstName()
	{
	driver.findElementById("createLeadForm_firstName").sendKeys("Ramachandran");
	return this;
	}
	public CreateLead enterLastName()
	{
	driver.findElementById("createLeadForm_lastName").sendKeys("M");
	return this;
	}
	public CreateLead enterCompany()
	{
	driver.findElementById("createLeadForm_companyName").sendKeys("Reliance");
	return this;
	}
	public ViewLead clickCreateLead()
	{
	driver.findElementByClassName("smallSubmit").click();
	return new ViewLead();
	}
	
	
}
