package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class AdminPage extends Base{

	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	// Objetos
	By btnSearch = By.xpath("//button[@type='submit']");
	
	// Custom Methods
	public boolean verifySearchButton() {
		highlightObject(btnSearch);
		takeScreenshot("Verified Search Button");
		return objIsDisplayed(btnSearch);
	}

}
