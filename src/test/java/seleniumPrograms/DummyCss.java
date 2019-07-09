package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DummyCss extends launchBrowser  {

	/**
	 * Print all the links in the webpage 
	 * 
	 * using by TAG name
	 * list
	 * @throws InterruptedException 
	 */
	
	@Test
	public void openAmazon() throws InterruptedException {
		
		driver.get("https://www.facebook.com");
		 
		List<WebElement> radio =  driver.findElements(By.xpath("//input[@type='radio']"));
		int s = radio.size();
		System.out.println("No of Radio buttons: "+s);
		radio.get(0).click();
		for (WebElement e : radio) {
			System.out.println("Radio button is selected? "+e.isSelected());;
		}
		
	}
	
	// Print all the values in the dropdown
	// select the value based on some text"lang"
}
