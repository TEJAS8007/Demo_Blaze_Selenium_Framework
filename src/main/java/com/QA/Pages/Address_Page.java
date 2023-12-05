package com.QA.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Address_Page {

	WebDriver driver;
	
	By Name_Box=By.cssSelector("#name");
	
	By Country_Box=By.cssSelector("#country");
	
	By City_Box=By.cssSelector("#city");
	
	By Card_Box=By.cssSelector("#card");
	
	By Month_Box=By.cssSelector("#month");
	
	By Year_Box=By.cssSelector("#year");
	
	By Purchase_Button=By.cssSelector("button[onclick='purchaseOrder()']");
	
	By Purchase_Msg=By.cssSelector("body > div:nth-child(19) > h2:nth-child(6)");
	
	By Order_Msg=By.cssSelector(".lead.text-muted");
	
	
	public Address_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void send_Address_Data(String name,String Country,String city,String card,String month,String year) {
		
		driver.findElement(Name_Box).sendKeys(name);
		driver.findElement(Country_Box).sendKeys(Country);
		driver.findElement(City_Box).sendKeys(city);
		driver.findElement(Card_Box).sendKeys(card);
		driver.findElement(Month_Box).sendKeys(month);
		driver.findElement(Year_Box).sendKeys(year);
		
		driver.findElement(Purchase_Button).click();
	}
	
	public String Verify_Address_Page_Purchase_Msg() {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wb.until(ExpectedConditions.visibilityOfElementLocated(Purchase_Msg)).getText();
	}
	
	public String Verify_Address_Page_Order_Msg() {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		return wb.until(ExpectedConditions.visibilityOfElementLocated(Order_Msg)).getText();
	}
}
