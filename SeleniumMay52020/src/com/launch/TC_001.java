package com.launch;

import java.io.IOException;

public class TC_001 extends Base{
	
	public static void main(String[] args) throws IOException, InterruptedException
	{	init();
		launch("chromebrowser");
		navigateUrl("amazonUrl");
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.close();
		
	}

}
