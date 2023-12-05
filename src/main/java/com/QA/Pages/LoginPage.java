package com.QA.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;

	By Sign_UpLInk=By.cssSelector("a#signin2");

	By userBox=By.cssSelector("input#sign-username");

	By PasswordBox=By.cssSelector("input#sign-password");

	By SignUp_Button=By.cssSelector("button[onClick='register()']");

	By Login_Link=By.cssSelector("a#login2");

	By login_User_Box=By.cssSelector("input#loginusername");

	By login_PasswordBox=By.cssSelector("input#loginpassword");

	By login_Button=By.cssSelector("button[onClick='logIn()']");



	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String Verify_login_Url() {
		
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		wb.until(ExpectedConditions.elementToBeClickable(Sign_UpLInk)).click();
		return driver.getTitle();
	}

	public void Performing_SignUp(String un ,String ps) {

		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wb.
		     until(
		    		 ExpectedConditions.visibilityOfElementLocated(userBox)).sendKeys(un);
		
		wb
		    .until(
		    		ExpectedConditions.visibilityOfElementLocated(PasswordBox)).sendKeys(ps);
		
		wb
		    .until(
		    		ExpectedConditions.visibilityOfElementLocated(SignUp_Button)).click();
		
		wb.
		     until(
		    		 ExpectedConditions.alertIsPresent()).accept();
		
		wb.
		     until(
		    		 ExpectedConditions.elementToBeClickable(Login_Link)).click();
	}

	public void Performing_Login(String un ,String ps) {

		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		wb.until(ExpectedConditions.visibilityOfElementLocated(login_User_Box)).sendKeys(un);
		wb.until(ExpectedConditions.visibilityOfElementLocated(login_PasswordBox)).sendKeys(ps);
		wb.until(ExpectedConditions.visibilityOfElementLocated(login_Button)).click();

	}
}
