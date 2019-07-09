package seleniumPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCssClassName extends launchBrowser{

	
	
	/**
	 * CSS Selector using class name .
	 */
	@Test
	public void cssClass() {
		/**
		 * CSS Selector using class name .
		 */
		 

		
		driver.get("https://www.icicibank.com");
		//. for class
		driver.findElement(By.cssSelector(".pl-login-ornage-box")).click();
	 
		
 
		
	}
	
	
}
