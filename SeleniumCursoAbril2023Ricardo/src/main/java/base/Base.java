package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

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
	
	/**
	 * Get Data from JSON file (Directly)
	 * 
	 * @author Ricardo Avalos
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONValue(String jsonFileObj, String nestedObjKey, String jsonKey){
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.getJSONObject(nestedObjKey).get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
	
	public String getEncryptedValue(String encryptedValue) {
		byte[] decode = Base64.decodeBase64(encryptedValue);
		return new String(decode);
	}
	
	/*
	 * Take screenshot
	 * 
	 * @author Ricardo Avalos
	 * @throws IOException
	 */
	public String takeScreenshot(String fileName){
		try {
			String pathFileName= GlobalVariables.PATH_SCREENSHOTS + fileName + ".png";
			Screenshot screenshot = new AShot().takeScreenshot(driver);
			ImageIO.write(screenshot.getImage(), "PNG", new File(pathFileName));
			return pathFileName;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
	
	/*
	 * Highlight
	 * @author Ricardo Avalos
	 * @date 02/23/2021
	 */
	public void highlightObject(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
	
	/*
	 * Highlight
	 * @author Ricardo Avalos
	 * @date 02/23/2021
	 */
	public void highlightObject(By locator){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement object = driver.findElement(locator);
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", object);
	}
	
	public void clickJavascript(By locator) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		WebElement object = driver.findElement(locator);
		executor.executeScript("arguments[0].click();", object);
	}

}
