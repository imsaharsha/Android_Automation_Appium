package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LoginPage extends driverInitiation {
	protected AppiumDriver driver;
	WebElement usernameInput;
	WebElement passwordInput;
	WebElement loginButton;
	WebElement err;

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

	public void clickLoginButton1() {
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

	public String clickLoginButton() {
		loginButton.click();
		String actual_errmsg = null;
		String name = name_getter();
		String psw = psw_getter();
		if (!name.equals("standard_user") && !psw.equals("secret_sauce")) {
			err = driver.findElement(AppiumBy
					.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView"));
			actual_errmsg = err.getText();
			String expected_errmsg = "Username and password do not match any user in this service.";
			Assert.assertEquals(actual_errmsg, expected_errmsg);
		} else {
			return ("login successfull");
		}
		return actual_errmsg;
	}

}
