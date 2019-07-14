package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCssTagAtribute extends launchBrowser{

	
	@Test(priority = 1)
	public void locateAnchorTag() throws InterruptedException {
		/**
		 * CSS Selector using tag and attribute TAG_NAME[ATTRIBUTE=VALUE]
		 * 
		 */
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("input[name=q]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name=q]")).sendKeys("iphone xr",Keys.ENTER);
		Thread.sleep(1000);
	}
}
