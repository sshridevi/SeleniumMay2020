package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties p;
	public static String projectPath = System.getProperty("user.dir");
	
	public static void init() throws IOException
	{
		//FileInputStream fis = new FileInputStream("C:\\Users\\Shashrik-Laptop\\Documents\\Shridevi\\Selenium\\workspace\\SeleniumMay52020\\data.properties");
		FileInputStream fis = new FileInputStream(projectPath + "//data.properties");
		p = new Properties();
		p.load(fis);
	}
	public static void launch(String browser) 
	{
	
		if(p.getProperty(browser).equals("chrome"))
			{   System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if (p.getProperty(browser).equals("firefox"))
			{  System.setProperty("webdriver.gecko.driver",projectPath+ "\\drivers\\geckodriver.exe");
				driver= new FirefoxDriver();
				
			}
	}
	public static void navigateUrl(String Url)
	{
		//driver.get(p.getProperty(Url));
		driver.navigate().to(p.getProperty(Url));
	}
	

}

