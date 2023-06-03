package com.orange;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.Base;
import base.GlobalVariables;
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
	ExtentReports reports;
	ExtentTest extentTest;

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
		
		// Donde guardar el reporte?
		reports = new ExtentReports(GlobalVariables.PATH_SCREENSHOTS+"/AutomationReport.html");
		extentTest = reports.startTest("Login Tests");
		
		// Step 0, 1, 2
		loginPage.loginOrange(username, base.getEncryptedValue(password));
		extentTest.log(LogStatus.PASS, "Login Orange", extentTest.addScreenCapture(base.takeScreenshot("Login Orange Report")));
		
		
		
	}

	@Test
	public void tc001() {

		// Step 3
		Assert.assertTrue(dashboardPage.validateUserIsLogged(), "User is not logeed successfully");
		extentTest.log(LogStatus.PASS, "Validate User is Logged", extentTest.addScreenCapture(base.takeScreenshot("User Logged")));

		// Step 4
		dashboardPage.clickAdmin();

		// Step 5
		Assert.assertTrue(adminPage.verifySearchButton(), "Search Button is not displayed");
		extentTest.log(LogStatus.PASS, "Verify Search button", extentTest.addScreenCapture(base.takeScreenshot("SearchButton")));

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
		
		reports.endTest(extentTest);
		reports.flush();
	}

}
