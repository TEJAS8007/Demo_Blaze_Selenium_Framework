package com.QA.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.QA.Factory.Driver_Factory;
import com.QA.Pages.Address_Page;
import com.QA.Pages.Checkout_Page;
import com.QA.Pages.HomePage;
import com.QA.Pages.LoginPage;
import com.QA.Pages.Product_Page;
import com.QA.Utilities.PassWord_Manager;
import com.github.javafaker.Faker;

public class Base_Test {

	HomePage homePage;
	WebDriver driver;
	LoginPage login;
	Product_Page product;
	Checkout_Page checkout;
	Address_Page address;
	Faker faker;
	Properties pro;
	Logger log;
	public static String UserName;
	public static String password;

	@BeforeClass
	public void Init_Prop() {

		try {

			FileInputStream file=new FileInputStream("src/test/resources/Test_Validation_Data/data.properties");
			pro=new Properties();
			pro.load(file);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeTest
	public void Set_up() {

		driver= Driver_Factory.init_Driver();
		homePage=new HomePage(driver);
		login=new LoginPage(driver);
		product=new Product_Page(driver);
		checkout=new Checkout_Page(driver);
		address=new Address_Page(driver);
		log=LogManager.getLogger(this.getClass());
		faker=new Faker();

		UserName=PassWord_Manager.getUserName();
		password=PassWord_Manager.getPassword();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		log.debug("Started.......");
	}

	@AfterTest
	public void Tear_Down() {
		driver.quit();
		log.debug("Ended.........");
	}


	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		TakesScreenshot screenshot = ((TakesScreenshot)driver);

		File src = screenshot.getScreenshotAs(OutputType.FILE);

		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");

		FileUtils.copyFile(src, dest);
	}

}
