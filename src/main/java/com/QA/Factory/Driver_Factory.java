package com.QA.Factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.QA.Utilities.Property_Reader;

public class Driver_Factory {

	static WebDriver driver;
	static Properties pro;
	
	public static WebDriver init_Driver() {
		
		pro=Property_Reader.Init_Prop();
		
		String Browser= pro.getProperty("browser").toLowerCase().trim();
		
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(Browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Please Enter Browser Name Correctly.........");
		}
		
		driver.get(pro.getProperty("url"));
	
		return driver;
	}
}
