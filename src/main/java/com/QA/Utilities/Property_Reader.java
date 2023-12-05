package com.QA.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Reader {

	static Properties pro;
	
	public static Properties Init_Prop() {
		
		try {
			FileInputStream file=new FileInputStream("src/main/resources/Configuration/config.properties");
			pro=new Properties();
			pro.load(file);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return pro;
	}
}
