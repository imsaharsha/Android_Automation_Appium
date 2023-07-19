package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Helper extends driverInitiation{
	private AppiumDriver driver;
	

	public Helper(AppiumDriver driver) {
		this.driver = driver;
	}
	public Helper()
	{
		
	}

	 public void scrollDown() {

		  Dimension screenSize = driver.manage().window().getSize();
		  int left = (int) (screenSize.getWidth() * 0.25); // 25% from the left side
		  int top = (int) (screenSize.getHeight() * 0.25); // 25% from the top side
		  int width = (int) (screenSize.getWidth() * 0.5); // 50% of the screen width
		  int height = (int) (screenSize.getHeight() * 0.5);

		  boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
		    ImmutableMap.of("left", left, "top", top, "width", width, "height", height, "direction", "down",
		      "percent", 3.0));
		 }

	
//	public void ClickElement(WebElement e)
//	{
//		e.click();
//	}
//	
//	public void sendKeysToElement(By e,String text)
//	{
//		element(e).sendKeys(text);
//	}
//	
//	public WebElement element(By path)
//	{
//		return (driver.findElement(path));
//	}

}
