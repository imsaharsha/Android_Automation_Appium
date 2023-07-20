package saucetest;

import io.appium.java_client.AppiumDriver;
import saucedemo.CartPage;

public class CartPageTest {
	private CartPage cartpage;
	
	
	public CartPageTest(AppiumDriver driver) {
        cartpage = new CartPage(driver);
    }
	
	
	public void testOpenCart() throws InterruptedException {
		cartpage.openCart();
		Thread.sleep(2000);
        
    }

}
