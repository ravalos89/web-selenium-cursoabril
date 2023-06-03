package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class DashboardPage extends Base{

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	// Objects
	By btnAvatar = By.xpath("//*[@class='oxd-userdropdown-tab']");
	By btnAdmin = By.xpath("//*[contains(@href, 'viewAdmin')]");
	By btnDashboard = By.xpath("//span[text()='Dashboard']");
	By btnLeave = By.xpath("");
	
	// Custom Methods
	public boolean validateUserIsLogged() {
		implicitWait(10);
		takeScreenshot("User is logged");
		return objIsDisplayed(btnAvatar);
	}
	
	public void clickAdmin() {
		click(btnAdmin);
		implicitWait(10);
		takeScreenshot("Clicked Admin Button");
	}
	
	
	public void clickDashboard() {
		click(btnDashboard);
		implicitWait(10);
		takeScreenshot("Clicked Dashboard Button");
	}

}
