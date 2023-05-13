package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
  @Test
  public void tc001() {
	  
//	  Test case
//	  
//	  Step 0 - Launch Browser and navigate Orange HRM
//	  Step 1 - Enter username and password //*[@name='username']//*[@name='password']
//	  Step 2 - Click on Login Button //button
//	  Step 3 - Validate user is logged succesfully //*[@class='oxd-userdropdown-tab']
//	  Step 4 - Click Admin in left menu //span[text()='Admin']
//	  Step 5 - Validate "Search" Button is displayed //button[@type='submit']
	  
//	  Tips:
//		  - Ejecutar el script manual
//		  - Obtencion de Objetos
//		  - Autonomia?
//		  - Desarrollo de script
	  
	  
	    // Step 0
	  	ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Maximize window
		driver.manage().window().maximize();
		
		// HARD WAIT JAVA
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Step 1
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		
		// Step 2	
		// EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button")));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//loadingObject")));
		driver.findElement(By.xpath("//button")).click();
		
		// Step 3
		boolean isUserLogged = driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']")).isDisplayed();
		Assert.assertEquals(isUserLogged, true);
		
		// Step 4
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		// step 5
		boolean isSearchDisplayed = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		Assert.assertEquals(isSearchDisplayed, false, "Element Search is displayed"+isSearchDisplayed);
		
		// Close Browser
		driver.close();
		
		
	  
	  
  }
}
