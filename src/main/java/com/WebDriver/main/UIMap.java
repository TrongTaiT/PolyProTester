package com.WebDriver.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

//đọc và lấy dữ liệu từ các file properties

public class UIMap {

	Properties properties;

	public UIMap(String filePath) {
		try {
			FileInputStream locator = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(locator);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getData(String elementName) throws Exception{
		String data = properties.getProperty(elementName);
		return data;
	}
	
	public By getLocator(String elementName) throws Exception{
		String locator = properties.getProperty(elementName);
		String locatorType = locator.split(":")[0];
		String locatorValue = locator.split(":")[1];
		
		if(locatorType.toLowerCase().equals("id")){
			return By.id(locatorValue);
		}else if(locatorType.toLowerCase().equals("name")) {
			return By.name(locatorValue);
		}else if(locatorType.toLowerCase().equals("classname") || 
				locatorType.toLowerCase().equals("class")) {
			return By.className(locatorValue);
		}else if(locatorType.toLowerCase().equals("tagname") || 
				locatorType.toLowerCase().equals("tag")) {
			return By.tagName(elementName);
		}else if(locatorType.toLowerCase().equals("xpath")) {
			return By.xpath(locatorValue);
		}else {
			throw new Exception("Locator type '" + locatorType + "' not defined!");
		}
	}
	
}
