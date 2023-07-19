package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class ProductsPage extends driverInitiation {
	private static final String itemName = "Sauce Labs Backpack";
	private AppiumDriver driver;
	private Helper helper;
	private By addToCartPath = By.xpath("//android.widget.TextView[@text='" + itemName + "']");
	private By buttonPath = By.xpath("//android.widget.TextView[@text='ADD TO CART']");
	

	public ProductsPage(AppiumDriver driver) {
		this.driver = driver;
		this.helper = new Helper(driver);
	}

	public void addToCart(String itemName) throws InterruptedException {

		WebElement item = driver.findElement(addToCartPath);
		item.click();
	}
	public void scrollUp() {
		helper.scrollDown();
		WebElement addToCartButton = driver.findElement(buttonPath);

		addToCartButton.click();

	}

//	public void clickadd() {
//		
//		WebElement addToCartButton = driver.findElement(
//				By.xpath("//android.widget.TextView[@text='ADD TO CART']"));
//
//		addToCartButton.click();
//
//	}
}
