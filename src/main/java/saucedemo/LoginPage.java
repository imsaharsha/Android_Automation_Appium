package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import SaucelabHelper.Helper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LoginPage extends Helper {
	protected AppiumDriver driver;
	WebElement usernameInput;
	WebElement passwordInput;
	WebElement loginButton;
	WebElement err;
	private String assertXpath="//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView";

	private By usernamexpath = By.xpath(
			"//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	private By passwordxpath = By.xpath(
			"//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	private By loginButtonxpath = By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]");

	public LoginPage(AppiumDriver driver) {
		this.driver = getDriver();
		usernameInput = driver.findElement(usernamexpath);
		passwordInput = driver.findElement(passwordxpath);
		loginButton = driver.findElement(loginButtonxpath);
	}

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

	public void enterPassword1(String password) {
		passwordInput.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public String name_getter() {
		return usernameInput.getText();
	}

	public String psw_getter() {
		return passwordInput.getText();
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void checkErrorMsg()
	{
		if(!name_getter().equals("Standard_user")||!psw_getter().equals("secret_sauce")) {
			try {
				 element(By.xpath(assertXpath));
				}catch (java.util.NoSuchElementException e) {
//				  Assert.fail("Error on Page:element not found");
					System.out.println(e);
				}
				Assert.assertTrue( element(By.xpath(assertXpath)).isDisplayed());
				System.out.println("login successful");	
		}
		
	}

}
