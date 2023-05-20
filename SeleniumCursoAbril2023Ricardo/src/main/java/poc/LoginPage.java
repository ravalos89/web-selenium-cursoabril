package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;
import base.GlobalVariables;

public class LoginPage extends Base{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	// Objetos
	By txtUsername = By.xpath("//*[@name='username']");
	By txtPassword = By.xpath("//*[@name='password']");
	By btnLogin = By.xpath("//button");
	
	// Custom methods
	public void loginOrange(String username, String password) {
		launchBrowser(GlobalVariables.QA_URL);
		hardWait(10000);
		implicitWait(20);
		type(txtUsername, username);
		type(txtPassword, password);
		explicitWait(btnLogin, 10);
		click(btnLogin);
	}

}
