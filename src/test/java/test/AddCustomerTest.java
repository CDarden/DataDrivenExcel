package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

WebDriver driver;
	
	ExcelReader exlread = new ExcelReader("testdata\\Techfios_TestData.xlsx");
	//create a string contain to read the excel file
	String userName = exlread.getCellData("LogInInfo", "UserName", 2);
	String password = exlread.getCellData("LogInInfo", "Password" , 2);
	String fullname = exlread.getCellData("AddContactInfo", "FullName", 2);
	String company = exlread.getCellData("AddContactInfo", "CompanyName", 2);
	String email = exlread.getCellData("AddContactInfo", "Email", 2);
	String phoneNum = exlread.getCellData("AddContactInfo", "Phone", 2);
	String address = exlread.getCellData("AddContactInfo", "Address", 2);
	String city = exlread.getCellData("AddContactInfo", "City", 2);
	String state = exlread.getCellData("AddContactInfo", "State", 2);
	String zip = exlread.getCellData("AddContactInfo", "Zip", 2);
	String group = exlread.getCellData("AddContactInfo", "Group", 2);
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		//when we call this method it is bringing us the driver
		driver=BrowserFactory.init();
		
		//to forward the driver to the LoginPage use the key word PageFactory
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName(userName);
		loginpage.enterPassword(password);
		loginpage.clickSignInButton();
		
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifyDashBoardElement();
		
		//create an object to call the addcustomerpage
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.clickCustomerButton();
		addCustomer.clickAddCustomerButton();
		addCustomer.waitTime(10);
		addCustomer.insertFullName(fullname);
		addCustomer.insertCompanyName(company);
		addCustomer.insertEmail(email);
		addCustomer.insertPhoneNumber(phoneNum);
		addCustomer.insertAddress(address);
		addCustomer.insertCity(city);
		addCustomer.insertState(state);
		addCustomer.insertZip(zip);
		addCustomer.insertGroup(group);
		addCustomer.clickOnSaveButton();
		addCustomer.wait(20);
		addCustomer.clickOnListCustomersButton();
		
		//BrowserFactory.tearDown();
	}
	
	
}
