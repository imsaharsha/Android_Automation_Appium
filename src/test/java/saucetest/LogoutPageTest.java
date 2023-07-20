package saucetest;

import org.testng.annotations.Test;
import saucedemo.logout;
import io.appium.java_client.AppiumDriver;

public class LogoutPageTest {
    private logout logoutPage;

    public LogoutPageTest(AppiumDriver driver) {
        logoutPage = new logout(driver);
    }

    @Test
    public void testLogout() throws InterruptedException {
        Thread.sleep(2000);
        logoutPage.clickMenuButton();
        Thread.sleep(2000);
        logoutPage.clickLogoutButton();
        Thread.sleep(2000);
    }
}
