package saucetest;

import org.testng.annotations.Test;
import saucedemo.CheckoutPage;
import io.appium.java_client.AppiumDriver;

public class CheckoutPageTest {
    private CheckoutPage checkoutPage;

    public CheckoutPageTest(AppiumDriver driver) {
        checkoutPage = new CheckoutPage(driver);
    }

    @Test
    public void testCheckoutCart() throws InterruptedException {
        checkoutPage.clickCheckoutButton();
        Thread.sleep(2000);
        checkoutPage.enterFirstName("John");
        checkoutPage.enterLastName("Snow");
        Thread.sleep(2000);
        checkoutPage.enterPostalCode("12345");
        Thread.sleep(2000);
        checkoutPage.clickContinueButton();
        Thread.sleep(2000);
        checkoutPage.scrollDown();
        checkoutPage.clickFinishButton();
        Thread.sleep(2000);
        checkoutPage.clickHomeButton();
    }
}
