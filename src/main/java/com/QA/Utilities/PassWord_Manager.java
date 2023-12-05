package com.QA.Utilities;

import com.github.javafaker.Faker;

public class PassWord_Manager {

	static Faker faker;
	
	public static String getUserName() {
		faker=new Faker();
		return faker.name().username();
	}
	
	public static String getPassword() {
		faker=new Faker();
		return faker.internet().password();
	}
}
