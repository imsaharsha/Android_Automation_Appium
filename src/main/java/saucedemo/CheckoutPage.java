package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import SaucelabHelper.Helper;

public class CheckoutPage extends Helper {
	protected AppiumDriver driver;
	private Helper helper;
	private By checkoutButtonLocator = By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]");
	private By firstNameLocator = By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]");
	private By lastNameLocator = By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]");
	private By postalCodeLocator = By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]");
	private By continueButtonLocator = By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]");
	private By finishbuttonPath = By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]/android.widget.TextView");
	private By clickHomeButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-BACK HOME\"]");
	public CheckoutPage(AppiumDriver driver) {
		this.driver = driver;
		helper = new Helper(driver);
	}

	public void clickCheckoutButton() {
		WebElement checkoutButton = driver.findElement(checkoutButtonLocator);
		checkoutButton.click();
	}

	public void enterFirstName(String firstName) {
		WebElement firstNameInput = driver.findElement(firstNameLocator);
		firstNameInput.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		WebElement lastNameInput = driver.findElement(lastNameLocator);
		lastNameInput.sendKeys(lastName);
	}

	public void enterPostalCode(String postalCode) {
		WebElement postalCodeInput = driver.findElement(postalCodeLocator);
		postalCodeInput.sendKeys(postalCode);
	}

	public void clickContinueButton() {
		WebElement continueButton = driver.findElement(continueButtonLocator);
		continueButton.click();
	}

	public void scrollDown() {
		helper.scrollDown();
	}

	public void clickFinishButton() {
		WebElement finishButton = driver.findElement(finishbuttonPath);
		finishButton.click();
		System.out.print("clicked finish button");
	}
	
	public void clickHomeButton()
	{
		WebElement homeButton = driver.findElement(clickHomeButton);
		homeButton.click();
	}
}
