package com.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
   
	public TestBase() {
	

    //Read configuration.properties file
    try {
    	//Declare a properties object
        Properties prop = new Properties();
       FileInputStream fis=new FileInputStream("/Users/ahasan/eclipse-workspace/com.classA/src/main/java/com/Config/config.properties");
       prop.load(fis);
       System.out.println(prop.getProperty("hi"));
    } catch (IOException e) {
        System.out.println("Configuration properties file cannot be found");
    }
    
	}
	
	
	public static void initialization() { 
			System.setProperty("webdriver.chrome.driver", "/Users/ahasan/Downloads/chromedriver");
			driver=new ChromeDriver();
			
		
		driver.get("https://gameprint.net/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

}
