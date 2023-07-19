package saucetest;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import saucedemo.driverInitiation;
import saucedemo.LoginPage;
import saucedemo.CartPage;
import saucedemo.ProductsPage;
import saucedemo.logout;
//import saucedemo.BrowserstackInitiation;
//import saucedemo.GetProperties;
import saucedemo.Helper;

public class BaseTest {
	private AppiumDriver driver;
	private LoginPage loginPage;
	private CartPage cartPage;
	private ProductsPage productsPage;
	private logout logout;

	@BeforeClass
	public void setup() throws Exception {
		driverInitiation driverinit = new driverInitiation();
//		BrowserstackInitiation driverinit = new BrowserstackInitiation();
		driverinit.Initiation();
		driver = driverinit.getDriver();
		loginPage = new LoginPage(driver);
		cartPage = new CartPage(driver);
		productsPage = new ProductsPage(driver);
		logout = new logout(driver);
	}

	@Test
	public void testLoginWithValidCredentials() throws InterruptedException {
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLoginButton();
		Thread.sleep(2000);
		// Add to cart functionality
		productsPage.addToCart("Sauce Labs Backpack");
		Thread.sleep(2000);
		productsPage.scrollUp();
		cartPage.openCart();
		Thread.sleep(2000);
		cartPage.removeCartItem();
		Thread.sleep(2000);
		// logout functionality
		Thread.sleep(2000);
		logout.clickMenuButton();
		Thread.sleep(2000);
		logout.clickLogoutButton();
		Thread.sleep(2000);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
