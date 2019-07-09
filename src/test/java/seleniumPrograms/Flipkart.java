package seleniumPrograms;



/**
 * ID
 * NAME
 * LinkText
 * link
 * xpath
 * tag
 * CSS
 */
 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
 

public class Flipkart extends launchBrowser{

	 @Test
	public void openURL() throws InterruptedException {
		
		 driver.get("https://www.flipkart.com");
		 String data = "Asus zen phone";
		  
		 driver.findElement(By.className("LM6RPg")).sendKeys(data,Keys.ENTER);
		 
		 
		 
	}

}
