package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{


	WebDriver driver;
	//create a constructor by creating a method using the same class name to receive the driver from LoginTest, and parametize it
	public AddCustomerPage (WebDriver driver) {
		//to connect the two top drivers use this.
		this.driver = driver;
		
	}
	
	// Element Library declared globally to reuse it elsewhere
		@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMERS_BUTTON_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_BUTTON_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULLNAME_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_DROPDOWN_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") WebElement CITY_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]") WebElement STATE_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]") WebElement ZIP_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"group\"]") WebElement GROUP_DROPDOWN_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]") WebElement SAVE_BUTTON_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMERS_BUTTON_LOCATOR;

		// create separate methods to interact with elements
		// you have to parametize your work
		public void clickCustomerButton() {
			CUSTOMERS_BUTTON_LOCATOR.click();
		}
		public void clickAddCustomerButton() {
			ADD_CUSTOMER_BUTTON_LOCATOR.click();
		}
		
		public void waitTime(int time) {
			waitforElement( driver, time, FULLNAME_FIELD_LOCATOR);
			
		}
		public void insertFullName(String fullname ) {
			String enteredName = fullname + BasePage.randomnumGenerator();
			FULLNAME_FIELD_LOCATOR.sendKeys(enteredName);
		}
		public void insertCompanyName(String company) {
			BasePage.dropDown(COMPANY_DROPDOWN_LOCATOR, company);
				
		}
		public void insertEmail(String email) {
			// to make the email unique create a string bucket
			String enteredEmail = BasePage.randomnumGenerator() + email;
			EMAIL_FIELD_LOCATOR.sendKeys(enteredEmail);
		}

		public void insertPhoneNumber(String phoneNum) {
			PHONE_FIELD_LOCATOR.sendKeys(phoneNum);
		}

		public void insertAddress(String address) {
			ADDRESS_FIELD_LOCATOR.sendKeys(address);
		}

		public void insertCity(String city) {
			CITY_FIELD_LOCATOR.sendKeys(city);
		}

		public void insertState(String state) {
			STATE_FIELD_LOCATOR.sendKeys(state);
		}

		public void insertZip(String zip) {
			ZIP_FIELD_LOCATOR.sendKeys(zip);

		}

		public void insertGroup(String group) {
			BasePage.dropDown(GROUP_DROPDOWN_LOCATOR, group);
		}

		public void wait(int time) {
			waitforElement( driver, time, SAVE_BUTTON_LOCATOR);
		}
		public void clickOnSaveButton() {
			SAVE_BUTTON_LOCATOR.click();
		}
		public void clickOnListCustomersButton() {
			LIST_CUSTOMERS_BUTTON_LOCATOR.click();
		}
		
			
}
