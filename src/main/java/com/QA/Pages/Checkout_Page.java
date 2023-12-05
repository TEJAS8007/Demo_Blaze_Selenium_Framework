package com.QA.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout_Page {

	WebDriver driver;
	
	By ProductName=By.cssSelector("td:nth-child(2)");
	
	By Product_Price=By.cssSelector("td:nth-child(3)");
	
	By Total_Price=By.cssSelector("#totalp");
	
	By Place_Order=By.cssSelector("button[class='btn btn-success']");
	
	
	
	public Checkout_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String Verify_CheckOut_Page_Title() {
		return driver.getTitle();
	}
	
	public String Verify_CheckOut_Page_Url() {
		return driver.getCurrentUrl();
	}
	
	public String Verify_CheckOut_Page_Product_Name() {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wb.until(ExpectedConditions.visibilityOfElementLocated(ProductName)).getText();
	}
	
	public String Verify_CheckOut_Page_Product_Price() {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wb.until(ExpectedConditions.visibilityOfElementLocated(Product_Price)).getText();
	}
	
	public String Verify_CheckOut_Page_Product_Total_Price() {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wb.until(ExpectedConditions.visibilityOfElementLocated(Total_Price)).getText();
	}
	
	public void click_On_PLace_Order() {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		wb.until(
				 ExpectedConditions.elementToBeClickable(Place_Order)
				)
		          .click();
		
	}
}
