package com.launch;

import java.io.IOException;

import org.openqa.selenium.By;

public class TC_002 extends Base{

		public static void main(String[] args) throws IOException
		{
			init();
			launch("chromebrowser");
			navigateUrl("citiUrl");
			
			driver.findElement(By.linkText("Read More")).click();
			driver.quit();
		}
}
