package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class CartPage extends driverInitiation {
	private AppiumDriver driver;
	private By cartIconLocator = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
	private By removeCartLocator = By.xpath("//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]");

	public CartPage(AppiumDriver driver) {
		this.driver = driver;
	}

	public void openCart() {
		WebElement cartIcon = driver.findElement(cartIconLocator);
		cartIcon.click();
	}

	public void removeCartItem() {
		WebElement removeButton = driver.findElement(removeCartLocator);
		removeButton.click();
	}
}
