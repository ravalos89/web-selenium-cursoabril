package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	private WebDriver driver;

	/*
	 * Constructor
	 * 
	 */

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Driver connection
	 */
	public WebDriver driverConnection(String platform) {

		switch (platform) {
		case "Chrome":
			ChromeOptions chromeOpt = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOpt);
			break;

		case "Firefox":
			driver = new FirefoxDriver();
			break;

		}

		return driver;
	}

	public WebDriver driverConnection() {

		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);

		return driver;
	}
	
	public void driverClose() {
		driver.close();
	}

	// HEADER
	/*
	 * Launch Browser
	 * 
	 * @author ricardo.avalos
	 * 
	 * @param url
	 * 
	 * @return NA
	 * 
	 * @throws IO Exception
	 * 
	 * @date
	 * 
	 * @updateDate
	 */
	public void launchBrowser(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void hardWait(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void implicitWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	public void explicitWait(By obj, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(obj));
	}

	public void type(By obj, String inputText) {
		try {
			driver.findElement(obj).sendKeys(inputText);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void click(By obj) {
		try {
			driver.findElement(obj).click();
			implicitWait(5);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public boolean objIsDisplayed(By obj) {
		try {
			return driver.findElement(obj).isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}

	}

}
