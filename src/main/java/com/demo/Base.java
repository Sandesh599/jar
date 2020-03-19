package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public static WebDriver driver;
	public  String curdir;
	
	@BeforeMethod
	public void openBrowser(){
		curdir=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", curdir+"\\src\\main\\java\\com\\driver\\chromedriver78.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/JAVA/Selenium%20Software/Offline%20Website/index.html");
		
	}
	
//	@Test
//	void m1(){
//		System.out.println(driver.getTitle());
//	}

}
