package saucedemo;

import java.io.InputStream;
import java.util.Properties;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class driverInitiation {
	protected AppiumDriver driver;
	protected Properties props;
	InputStream inputStream;

	public void Initiation() throws MalformedURLException {

		try {
			props = new Properties();
			String propFileName = "config.properties";
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			props.load(inputStream);

			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", props.getProperty("androidplatformName"));
			caps.setCapability("deviceName", props.getProperty("androiddeviceName"));
			caps.setCapability("udid", props.getProperty("androidudid"));
			caps.setCapability("automationName", props.getProperty("androidAutomationName"));
			caps.setCapability("appPackage", "com.swaglabsmobileapp");
			caps.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");

			URL url = new URL(props.getProperty("appiumURL"));
			driver = new AndroidDriver(url, caps);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public AppiumDriver getDriver() {
		return driver;
	}

}
