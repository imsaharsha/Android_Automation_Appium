//package saucedemo;
//
//import java.io.InputStream;
//import java.net.URL;
//import java.util.Map;
//import java.util.HashMap;
//import java.util.Properties;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//
//public class BrowserstackInitiation extends GetProperties {
//
//	protected AppiumDriver driver;
//
//	public BrowserstackInitiation(AppiumDriver driver) {
//		this.driver = driver;
//	}
//
//	public BrowserstackInitiation() {
//
//	}
//
//	public void Initiation() throws Exception {
//		Map<String, String> props = getConfigProperties();
//		String platform = props.get("platformName");
//		String automation = props.get("automationName");
//		String device = props.get("deviceName");
//		String token = props.get("appToken");
//		String url = props.get("browserstackUrl");
//
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("platformName", platform);
//		capabilities.setCapability("automationName", automation);
//		capabilities.setCapability("noReset", "true");
//		capabilities.setCapability("skipUnlock", "true");
//		capabilities.setCapability("browserstack.interactiveDebugging", "true");
//		capabilities.setCapability("deviceName", device);
//		capabilities.setCapability("app", token);
//		driver = new AndroidDriver(new URL(url), capabilities);
//	}
//
//	public AppiumDriver getDriver() {
//		return driver;
//	}
//
//}
