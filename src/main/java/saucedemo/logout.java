package saucedemo;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

public class logout extends driverInitiation {
    protected AppiumDriver driver;
    private By menuButtonLocator = By.xpath(".//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");
    private By logoutButtonLocator = By.xpath(".//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]/android.widget.TextView");

    public logout(AppiumDriver driver) {
        this.driver = driver;
    }

    public void clickMenuButton() {
        driver.findElement(menuButtonLocator).click();
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButtonLocator).click();
    }
}
