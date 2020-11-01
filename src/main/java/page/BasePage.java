package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	
	public static void waitforElement(WebDriver driver, int timeInSeconds, WebElement element) {
		// creating an explicit wait in a method
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//creating a method for dropdown and create a webElement and string
			public static void dropDown(WebElement locator, String VisibleText) {
				Select sel = new Select(locator);
				sel.selectByVisibleText(VisibleText);
			}
		
	
	
	//to create random numbers
			public static int randomnumGenerator() {
				Random rnd = new Random();
				int randomNum = rnd.nextInt(999);
				return randomNum;
			}
}
