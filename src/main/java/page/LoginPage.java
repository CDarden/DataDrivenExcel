package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	//create a constructor by creating a method using the same class name to receive the driver from LoginTest, and parametize it
	public LoginPage(WebDriver driver) {
		//to connect the two top drivers use this.
		this.driver = driver;
		
	}
	
	// Element Library declared globally to reuse it elsewhere
		@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_FIELD;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
		@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_FIELD;

		// create separate methods to interact with elements
		// you have to parametize your work
		public void enterUserName(String userName) {
			USERNAME_FIELD.sendKeys(userName);
		}

		public void enterPassword(String password) {
			PASSWORD_FIELD.sendKeys(password);
		}

		public void clickSignInButton() {
			SIGNIN_BUTTON_FIELD.click();
		}
	
	
	
}
