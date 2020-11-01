package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTestPage {

	WebDriver driver;
	
	ExcelReader exlread = new ExcelReader("testdata\\Techfios_TestData.xlsx");
	//create a string contain to read the excel file
	String userName = exlread.getCellData("LogInInfo", "UserName", 2);
	String password = exlread.getCellData("LogInInfo", "Password" , 2);
	
	@Test
	public void validUserShouldBeAbleTologin() {
		//when we call this method it is bringing us the driver
		driver=BrowserFactory.init();
		
		//to forward the driver to the LoginPage use the key word PageFactory
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName(userName);
		loginpage.enterPassword(password);
		loginpage.clickSignInButton();
		
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifyDashBoardElement();
		
		BrowserFactory.tearDown();
	}
	
}
