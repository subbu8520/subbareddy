package seleniumPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCssClassName extends launchBrowser {

	/**
	 * CSS Selector using class name .
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void cssClass() throws InterruptedException {
		/**
		 * CSS Selector using class name .
		 */

		driver.get("https://www.icicibank.com");
		// . for class
		driver.findElement(By.cssSelector(".pl-login-ornage-box")).click();

		Thread.sleep(2000);
		driver.quit();

	}

}
