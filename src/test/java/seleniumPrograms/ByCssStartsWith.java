package seleniumPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCssStartsWith extends launchBrowser{
	
	@Test
	public void startsWith() throws InterruptedException {
		/**
		 * CSS Selector using Starts-with (^) TAGNAME[ATTRIBUTE^='VALUE']
		  
		 */
		// Google Search
		driver.get("http://www.google.co.in");
		driver.findElement(By.cssSelector("input[class^='gLFyf']")).sendKeys("MAC BOOK PRO");
		Thread.sleep(1000); 			//input[starts-with(@value='Google')]
		driver.findElement(By.cssSelector("input[value^='Google']")).click();

	}

}
