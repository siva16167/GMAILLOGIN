package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static utils.Utils1.*;
import static driverscript.DriverScript.*;
public class GmailPage {
	public static By  signin=By.xpath("//*[text()='Sign in - Google Accounts']");
	public static By gmailid=By.id("identifierId");
	public static By password=By.name("password");
	public static By  next=By.xpath("//*[text()='Next']");


	// click on signin link
	public void clickOnSignIn() {
		driver.findElement(signin).click();
	}
	// enter the gmail id
	public void enterGmailId() {
		driver.findElement(gmailid).sendKeys(add.get("userid"));
	}
	// click on next button
	public void clickNextButton() {
		Actions act=new Actions(driver);
		act.click(driver.findElement(next)).build().perform();
		System.out.println(driver.getTitle());
	}

	// enter the password
	public void  enterPassword() {
		driver.findElement(password).sendKeys(add.get("password"));
	}
}
