package com.QA.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Page {
	
	WebDriver driver;
	
	By product_Image=By.xpath("//div[@id=\"tbodyid\"]//div[1]//div[1]//a[1]//img[1]");
	
	By productName =By.cssSelector("h2[class='name']");
	
	By Product_description=By.xpath("//div[@id='more-information']");
	
	By Add_Cart_Button=By.cssSelector(".btn.btn-success.btn-lg");
	// alert Handling
	
	By Cart=By.cssSelector("#cartur");
		
	public Product_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String Verify_Product_Page_Title() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		wb.until(ExpectedConditions.elementToBeClickable(product_Image)).click();
		return driver.getTitle();
	}
	
	public String Verify_Product_Page_Url() {
		return driver.getCurrentUrl();
	}
	
	public String Verify_Product_Page_Product_Name() {	
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wb.until(ExpectedConditions.visibilityOfElementLocated(productName)).getText();	
	}
	
	public String Verify_Product_Page_Product_Description() {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wb.until(ExpectedConditions.visibilityOfElementLocated(Product_description)).getText();	}
	
	public void Verify_Product_Page_Cart_Button() {
		
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wb.until(ExpectedConditions.elementToBeClickable(Add_Cart_Button)).click();
		
		wb.until(ExpectedConditions.alertIsPresent()).accept();
		
		wb.until(ExpectedConditions.elementToBeClickable(Cart)).click();
	}
}