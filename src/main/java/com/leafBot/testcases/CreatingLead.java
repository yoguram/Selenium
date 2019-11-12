package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.Login;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
public class CreatingLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName="Create Lead";
		testcaseDec = "Creating a Lead with the given Datas";
		author="Ram";
		category="Sanity";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String username, String password) {
		Login obj = new Login();
		obj.enterUserName().enterPassword().clickLogin().clickCRMSFA().clickLead().clickCreateLead().enterCompany()
				.enterFirstName().enterLastName().clickCreateLead().verify();
	}

}
