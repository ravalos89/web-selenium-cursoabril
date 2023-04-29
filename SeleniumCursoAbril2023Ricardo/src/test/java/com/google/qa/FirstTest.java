package com.google.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
  @Test
  public void f() {
	  
	  ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		//chromeOpt.addArguments("user-data-dir=/Users/ricardoavalos/Library/Application Support/Google/Chrome/Default");
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
  }
}
