package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {
	
WebDriver driver;
	
	//create a constractor
	public DashBoardPage(WebDriver driver) {
		this.driver =driver;
	}
	// Element Library
		@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard' )]") WebElement DASHBOARD_ELEMENT_FIELD;
		
	//Methods to interact with the elements by creating a method.
	public void verifyDashBoardElement() {
		
	// do an assertion to validate the dashboard page
		Assert.assertEquals(DASHBOARD_ELEMENT_FIELD.getText(), "Dashboard", "Wrong Page");
	}
}