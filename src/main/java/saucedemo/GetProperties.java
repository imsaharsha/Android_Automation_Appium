//package saucedemo;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//
//public class GetProperties {
//	
//	private Properties props;
//	InputStream inputStream;
//	
//public Map getConfigProperties() throws IOException
//{
//	
//	props = new Properties();
//	String propFileName = "config.properties";
//	inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
//	props.load(inputStream);
//	
//    Map<String, String> configProperties = new HashMap<String, String>();
//    configProperties.put("platformName", props.getProperty("platformName"));
//    configProperties.put("automationName", props.getProperty("automationName"));
//    configProperties.put("deviceName",props.getProperty("deviceName"));
//    configProperties.put("appToken",props.getProperty("browserstackAppToken"));
//    configProperties.put("browserstackUrl",props.getProperty("browserstackUrl"));
//    
//	return configProperties;
//	
//}
//}
