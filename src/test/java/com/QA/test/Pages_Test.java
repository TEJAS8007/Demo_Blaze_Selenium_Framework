package com.QA.test;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Pages_Test extends Base_Test{

	
	@Test(priority = 1)
	public void Home_Page_Title_Test() {
		String ExpectedTitle= homePage.Home_Page_Title();
		System.out.println("Home Page Title : "+ExpectedTitle);
		
		log.info("Home Page Title Test Started...");
		
		if(ExpectedTitle.equals(pro.getProperty("Home_Page_Title"))) {
			Assert.assertTrue(true);
			log.info("Home Page Title Matched...");
		} else {
			Assert.assertTrue(false);
			log.warn("Home Page Title not Matched...");
		}
	}

	@Test(priority = 2)
	public void Home_Page_Url_Test() {
		String ExpectedUrl= homePage.Home_Page_url();
		System.out.println("Home Page Url : "+ExpectedUrl);
		
		log.info("Home Page Url Test Started...");
		
		if(ExpectedUrl.equals(pro.getProperty("Home_Page_url"))) {
			Assert.assertTrue(true);
			log.info("Home Page Url Matched...");
		} else {
			Assert.assertTrue(false);
			log.warn("Home Page Url not Matched...");
		}
	}

	@Test(priority = 3)
	public void Home_Page_Verify_Home_PAge_Logo_Test() {
		boolean logo= homePage.Verify_Home_Page_Logo();
		System.out.println("Home Page logo : "+logo);
		
		log.info("Home Page Logo Test Started...");
		
		if(logo==true) {
			Assert.assertTrue(true);
			log.info("Home Page logo Matched...");
		} else {
			Assert.assertTrue(false);
			log.warn("Home Page logo not Matched...");
		}
	}

	@Test(priority = 4)
	public void Home_Page_Verify_Home_PAge_Links_Test() {
		int count= homePage.Verify_Home_Page_Links();
		System.out.println("Home Page links : "+count);
		
		log.info("Home Page Links Test Started...");
		
	}

	@Test(priority = 5)
	public void Home_Page_Verify_Home_PAge_Products_Test() {
		int count= homePage.Verify_Home_Page_Products();
		System.out.println("Home Page products : "+count);
		
		log.info("Home Page Products Test Started...");
		
		if(count == Integer.parseInt(pro.getProperty("Home_Page_products"))) {
			Assert.assertTrue(true);
			log.info("Home Page Products Matched...");
		} else {
			Assert.assertTrue(false);
			log.warn("Home Page Products not Matched...");
		}
	}

	@Test(priority = 6)
	public void Home_Page_Verify_Home_PAge_Products_Name_Test() {
		homePage.Verify_Home_Page_Products_NAme();
		log.info("Home Page Products name Verified...");
	}

	@Test(priority = 7)
	public void Home_Page_Verify_Home_PAge_Footer_Text_Test() {
		homePage.Verify_Footer_Texts();
		log.info("Home Page Footer Text Verified...");
	}

	@Test(priority = 8)
	public void Login_Page_Url_Test() {
		String ExpectedUrl= login.Verify_login_Url();
		System.out.println("Login Url : "+ExpectedUrl);
		
		log.info("Login Page Title Test Started...");
		
		if(ExpectedUrl.equals(pro.getProperty("Login_Url"))) {
			Assert.assertTrue(true);
			log.info("Login Page Title Matched...");
		} else {
			Assert.assertTrue(false);
			log.warn("Login Page Title not Matched...");
		}
	}

	@Test(priority = 9)
	public void Login_Page_Signu_UP_Test() {
		login.Performing_SignUp(UserName, password);
		log.info("Login Page Signup Done...");
	}

	@Test(priority = 10)
	public void Login_Page_Login_Test() {
		login.Performing_Login(UserName, password);
		log.info("Login Page Login Done...");
	}

	@Test(priority = 11)
	public void Product_Page_Title_Test() {
		String ExpectedTitle= product.Verify_Product_Page_Title();
		System.out.println("Product Title : "+ExpectedTitle);
		
		log.info("Product Page Title Test Started");
		
		if(ExpectedTitle.equals(pro.getProperty("Product_Title"))) {
			Assert.assertTrue(true);
			log.info("Product Page Title Matched");
		} else {
			Assert.assertTrue(false);
			log.warn("Product Page Title Not Matched");
		}
	}

	@Test(priority = 12)
	public void Product_Page_Url_Test() {
		String ExpectedUrl= product.Verify_Product_Page_Url();
		System.out.println("Product url : "+ExpectedUrl);
		
		log.info("Product Page Url Test Started");
		
		if(ExpectedUrl.equals(pro.getProperty("Product_Url"))) {
			Assert.assertTrue(true);
			log.info("Product Page Url Matched");
		} else {
			Assert.assertTrue(false);
			log.info("Product Page Url Matched");
		}
	}

	@Test(priority = 13)
	public void Product_Page_Product_Name_Test() {
		String Product_Name= product.Verify_Product_Page_Product_Name();
		System.out.println(Product_Name);
		
		log.info("Product Page Product Name Test Started");
		
		if(Product_Name.equals(pro.getProperty("Product_Name"))) {
			Assert.assertTrue(true);
			log.info("Product Page Product Name Matched");
		} else {
			Assert.assertTrue(false);
			log.info("Product Page Product Name not matched");
		}
	}

	@Test(priority = 14)
	public void Product_Page_Product_Description_Test() {
		String Description= product.Verify_Product_Page_Product_Description();
		System.out.println(Description);
		
		log.info("Product Page Product Description Test Started");
		
		if(Description.contains(pro.getProperty("Product_description"))) {
			Assert.assertTrue(true);
			log.info("Product Page Product Description matched");
		} else {
			Assert.assertTrue(false);
			log.info("Product Page Product Description not matched");
		}
	}

	@Test(priority = 15)
	public void Product_Page_Product_Cart_Test() {
		product.Verify_Product_Page_Cart_Button();
		log.info("Product Page Click on cart button done");
	}

	@Test(priority = 16)
	public void Checkout_Page_Title_Test() {
		String ExpectedTitle= checkout.Verify_CheckOut_Page_Title();
		System.out.println("Checkout Title : "+ExpectedTitle);
		
		log.info("Checkout Page Title Test Started..");
		
		if(ExpectedTitle.equals(pro.getProperty("Checkout_Title"))) {
			Assert.assertTrue(true);
			log.info("Checkout Page Title Matched..");
		} else {
			Assert.assertTrue(false);
			log.warn("Checkout Page Title not Matched..");
		}
	}

	@Test(priority = 17)
	public void Checkout_Page_Url_Test() {
		String ExpectedUrl= checkout.Verify_CheckOut_Page_Url();
		System.out.println("Checkout url : "+ExpectedUrl);
		
		log.info("Checkout Page Url Test Started..");
		
		if(ExpectedUrl.equals(pro.getProperty("Checkout_url"))) {
			Assert.assertTrue(true);
			log.info("Checkout Page Title Matched..");
		} else {
			Assert.assertTrue(false);
			log.info("Checkout Page Title not matched..");
		}
	}

	@Test(priority = 18)
	public void Checkout_Page_Product_Name_Test() {
		String name= checkout.Verify_CheckOut_Page_Product_Name();
		System.out.println(name);
		
		log.info("Checkout Page Product Name Test Started..");
		
		if(name.equals(pro.getProperty("Checkout_Product_Name"))) {
			Assert.assertTrue(true);
			log.info("Checkout Page Product Name Matched..");
		} else {
			Assert.assertTrue(false);
			log.warn("Checkout Page Product Name Not Matched..");
		}
	}

	@Test(priority = 19)
	public void Checkout_Page_Product_price_Test() {
		String price= checkout.Verify_CheckOut_Page_Product_Price();
		System.out.println(price);
		
		log.info("Checkout Page Product Price Test Started..");
		
		if(price.equals(pro.getProperty("Checkout_Product_Price"))) {
			Assert.assertTrue(true);
			log.info("Checkout Page Product Name Matched..");
		} else {
			Assert.assertTrue(false);
			log.info("Checkout Page Product Name not matched..");
		}
	}

	@Test(priority = 20)
	public void Checkout_Page_Product_Total_price_Test() {
		String price= checkout.Verify_CheckOut_Page_Product_Total_Price();
		System.out.println(price);
		
		log.info("Checkout Page Product Price Test Started..");
		
		if(price.equals(pro.getProperty("Checkout_Product_Price"))) {
			Assert.assertTrue(true);
			log.info("Checkout Page Product price matched..");
		} else {
			Assert.assertTrue(false);
			log.info("Checkout Page Product price not matched..");
		}
	}

	@Test(priority = 21)
	public void Checkout_Page_Product_Place_Order_Test() {
		checkout.click_On_PLace_Order();
		log.info("Checkout Page Click on place Order..");
	}

	@Test(priority = 22)
	public void Address_Page_Send_Data_Test() {
		address.send_Address_Data(

				faker.name().fullName(), 
				faker.country().name(), 
				faker.country().capital(), 
				faker.number().digit().repeat(10), 
				"May" , 
				faker.number().toString()

				);
		log.info("Address Page Data Send");
	}

	/*
	@DataProvider
	public Object[][] getData() {
		Object[][] obj=Excel_Data_Reader.getExcelData();
		return obj;
	}
	 */

	@Test(priority = 23)
	public void Address_Page_Purchase_Msg_Test() {
		String msg= address.Verify_Address_Page_Purchase_Msg();
		System.out.println(msg);
		
		log.info("Address Page Purchase Msg Test Started");
		
		if(msg.equals(pro.getProperty("Purchase_Msg"))) {
			Assert.assertTrue(true);
			log.info("Address Page Purchase Msg Matched..");
		} else {
			Assert.assertTrue(false);
			log.info("Address Page Purchase Msg not matched...");
		}
	}

	@Test(priority = 24)
	public void Address_Page_Order_Msg_Test() {
		String msg= address.Verify_Address_Page_Order_Msg();
		System.out.println(msg);
		log.info("Address Page Order Msg Test Started");
	}


	
}
