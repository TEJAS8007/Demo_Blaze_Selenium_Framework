package com.QA.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	By logo=By.cssSelector("#nava");

	By products=By.cssSelector("div[class='card h-100']");

	By productsName=By.cssSelector("div.card-block h4");

	By Footer=By.cssSelector("div#fotcont div");

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String Home_Page_Title() {
		return driver.getTitle();
	}

	public String Home_Page_url() {
		return driver.getCurrentUrl();
	}

	public boolean Verify_Home_Page_Logo() {
		boolean found;

		WebElement logos=driver.findElement(logo);
		if(logos.isDisplayed()==true) {
			found=true;
		}
		else {
			found=false;
		}
		return found;
	}

	public int Verify_Home_Page_Links() {

		int count=0;

		List<WebElement> Links_List= driver.findElements(By.tagName("a"));

		for(int a=0;a<Links_List.size();a++) {
			String text= Links_List.get(a).getText();
			System.out.println(text);
			count++;
		}

		return count;
	}

	public int Verify_Home_Page_Products() {

		int count=0;

		List<WebElement> Links_List= driver.findElements(products);

		for(int a=0;a<Links_List.size();a++) {
			String text= Links_List.get(a).getText();
			System.out.println(text);
			count++;
		}

		return count;
	}

	public void Verify_Home_Page_Products_NAme() {

		List<WebElement> Names_List= driver.findElements(productsName);

		for(WebElement ele :Names_List) {
			System.out.println(ele.getText());
		}
	}

	public void Verify_Footer_Texts() {

		List<WebElement> footer_List= driver.findElements(Footer);

		for(WebElement ele :footer_List) {
			System.out.println(ele.getText());
		}
	}
}
