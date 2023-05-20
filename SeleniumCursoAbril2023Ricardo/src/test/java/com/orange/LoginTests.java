package com.orange;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import poc.AdminPage;
import poc.DashboardPage;
import poc.LoginPage;

public class LoginTests {
	
	WebDriver driver;
	Base base;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	String username, password;

	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.driverConnection();
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		adminPage = new AdminPage(driver);
		
		// Set values
		this.username = base.getJSONValue("LoginData", "admin", "username");
		this.password = base.getJSONValue("LoginData", "admin", "password");
		
		// Step 0, 1, 2
		loginPage.loginOrange(username, base.getEncryptedValue(password));
		
	}

	@Test
	public void tc001() {
		
		// Step 3
		Assert.assertTrue(dashboardPage.validateUserIsLogged(), "User is not logeed successfully");
		
		// Step 4
		dashboardPage.clickAdmin();
		
		// Step 5
		Assert.assertTrue(adminPage.verifySearchButton(), "Search Button is not displayed");

	}
	
	@Test
	public void tc002() {
		
		// Step 3
		Assert.assertTrue(dashboardPage.validateUserIsLogged(), "User is not logeed successfully");
		
		// Step 4
		dashboardPage.clickAdmin();
		
		// Step 5
		Assert.assertTrue(adminPage.verifySearchButton(), "Search Button is not displayed");

	}
	
	@AfterMethod
	public void afterMethod() {
		
	}


	@AfterTest
	public void afterTest() {
		base.driverClose();
	}

}
