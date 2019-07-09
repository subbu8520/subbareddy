package seleniumPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCssContains extends launchBrowser{
	
	@Test
	public void startsWith() throws InterruptedException {

		/**
		 * CSS Selector using Contains (*) TAGNAME[ATTRIBUTE*=VALUE]
		 * 
		 */	
		driver.get("http://www.google.co.in");
		driver.findElement(By.cssSelector("input[class^='gLFyf']")).sendKeys("MAC BOOK PRO");
		Thread.sleep(2000);
								//input[contains(@value,'Feeling Lucky')]
		driver.findElement(By.cssSelector("input[value*='Feeling Lucky']")).click();

		
		
	}

}
