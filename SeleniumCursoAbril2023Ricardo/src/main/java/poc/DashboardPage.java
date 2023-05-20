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
	By btnAdmin = By.xpath("//span[text()='Admin']");
	By btnDashboard = By.xpath("//span[text()='Dashboard']");
	By btnLeave = By.xpath("");
	
	// Custom Methods
	public boolean validateUserIsLogged() {
		return objIsDisplayed(btnAvatar);
	}
	
	public void clickAdmin() {
		click(btnAdmin);
	}
	
	
	public void clickDashboard() {
		click(btnDashboard);
	}

}
