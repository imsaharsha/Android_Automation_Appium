package saucetest;

import org.testng.annotations.Test;

import SaucelabHelper.Helper;
import saucedemo.ProductsPage;
import io.appium.java_client.AppiumDriver;
//import saucedemo.CartPage;

public class ProductsPageTest extends Helper {
    private ProductsPage productsPage;
   // private CartPage  cartPage;

    public ProductsPageTest(AppiumDriver driver) {
        productsPage = new ProductsPage(driver);
    }

    @Test
    public void testAddItemToCart() throws InterruptedException {
    	productsPage.addToCart("Sauce Labs Backpack");
		Thread.sleep(2000);

		// Checkout process
		productsPage.scrollUp();
		Thread.sleep(2000);
		
        
    }
}
