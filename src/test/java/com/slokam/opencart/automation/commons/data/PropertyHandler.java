package com.slokam.opencart.automation.commons.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyHandler {

	
	public void test1() {
		File file = new File("./src/test/resources/app.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fis);
			
			String value = props.getProperty("url");
			System.out.println(value);
			
			String v = props.getProperty("waitTime","30");
			
			System.out.println(v);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new PropertyHandler().test1();
	}
}
