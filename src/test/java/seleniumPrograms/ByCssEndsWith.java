package seleniumPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCssEndsWith extends launchBrowser{
	
	@Test
	public void startsWith() throws InterruptedException {
		/**
		 * CSS Selector using Starts-with (^) TAGNAME[ATTRIBUTE^='VALUE']
		  
		 */
		// Google Search
		driver.get("https://www.icicibank.com/");
		driver.findElement(By.cssSelector("*[class*='pl-login-box']")).click();
		Thread.sleep(1000); 			//input[starts-with(@value='Google')]
		driver.quit();

	}

}
