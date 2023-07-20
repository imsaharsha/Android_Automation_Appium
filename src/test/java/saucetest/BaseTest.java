package saucetest;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import SaucelabHelper.Helper;
import io.appium.java_client.AppiumDriver;
import saucedemo.driverInitiation;
import saucedemo.LoginPage;
import saucedemo.CartPage;
import saucedemo.ProductsPage;
import saucedemo.logout;
import saucedemo.CheckoutPage;

public class BaseTest {
	private AppiumDriver driver;
	private LoginPage loginPage;
	private CartPage cartPage;
	private ProductsPage productsPage;
	private logout logout;
	private CheckoutPage checkoutPage;

	@BeforeClass
	public void setup() throws Exception {
		driverInitiation driverinit = new driverInitiation();
		// BrowserstackInitiation driverinit = new BrowserstackInitiation();
		driverinit.Initiation();
		driver = driverinit.getDriver();
		loginPage = new LoginPage(driver);
		cartPage = new CartPage(driver);
		productsPage = new ProductsPage(driver);
		logout = new logout(driver);
		checkoutPage = new CheckoutPage(driver);
	}

//	@Test
//	public void testLoginWithValidCredentials() throws InterruptedException {
//		loginPage.enterUsername("standard_user");
//		loginPage.enterPassword("secret_sauce");
//		loginPage.clickLoginButton();
//		Thread.sleep(2000);
//
//	}
//
//	@Test(dependsOnMethods = "testLoginWithValidCredentials")
//	public void addItemToCart() throws InterruptedException {
//		productsPage.addToCart("Sauce Labs Backpack");
//		Thread.sleep(2000);
//
//		// Checkout process
//		productsPage.scrollUp();
//		cartPage.openCart();
//		Thread.sleep(2000);
//
//	}
//
//	@Test(dependsOnMethods = "addItemToCart")
//	public void cartList() throws InterruptedException {
//		checkoutPage.clickCheckoutButton();
//		Thread.sleep(2000);
//		checkoutPage.enterFirstName("John");
//
//		checkoutPage.enterLastName("Snow");
//		Thread.sleep(2000);
//		checkoutPage.enterPostalCode("12345");
//		Thread.sleep(2000);
//		checkoutPage.clickContinueButton();
//		Thread.sleep(2000);
//		checkoutPage.scrollDown(); // Scroll to locate the Finish button
//		checkoutPage.clickFinishButton(); // Click the Finish button
//		Thread.sleep(2000);
//		checkoutPage.clickHomeButton();
//		// Remove item from cart
//	}
//
//	@Test(dependsOnMethods = "cartList")
//	public void logout() throws InterruptedException {
//		Thread.sleep(2000);
//		logout.clickMenuButton();
//		Thread.sleep(2000);
//		logout.clickLogoutButton();
//		Thread.sleep(2000);
//	}
	@Test
	public void testCase() throws InterruptedException
	{
		LoginPageTest loginPageTest = new LoginPageTest(driver);
        loginPageTest.testLoginWithValidCredentials();

        ProductsPageTest productsPageTest = new ProductsPageTest(driver);
        productsPageTest.testAddItemToCart();

        CartPageTest cartPageTest = new CartPageTest(driver);
        cartPageTest.testOpenCart();
        
        CheckoutPageTest checkoutPageTest = new CheckoutPageTest(driver);
        checkoutPageTest.testCheckoutCart();

        LogoutPageTest logoutPageTest = new LogoutPageTest(driver);
        logoutPageTest.testLogout();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
