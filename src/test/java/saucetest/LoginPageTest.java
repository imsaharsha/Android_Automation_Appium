package saucetest;

import org.testng.annotations.Test;
import saucedemo.LoginPage;
import io.appium.java_client.AppiumDriver;

public class LoginPageTest {
    private LoginPage loginPage;

    public LoginPageTest(AppiumDriver driver) {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        Thread.sleep(2000);
        // Add assertions here as needed
    }
}
