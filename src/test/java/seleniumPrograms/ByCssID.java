package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ByCssID extends launchBrowser {

	
	@Test(priority = 1)
	public void locateAnchorTag() throws InterruptedException {
		driver.get("http://www.amazon.in");
		/**
		 * CSS Selector using ID #
		 */
		 
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone Xs",Keys.ENTER);
		Thread.sleep(1000);
}
	@AfterTest()
	public void close() {
		driver.quit();
	}


}

