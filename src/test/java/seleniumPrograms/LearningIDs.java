package seleniumPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearningIDs extends launchBrowser {

	@Test
	public void openAmazon() throws InterruptedException {

		// driver.get("https://www.amazon.com");
		// WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		// ele.sendKeys("Mac laptop");
		//
		// ele.clear();
		// Thread.sleep(1000);
		// driver.findElement(By.name("field-keywords")).sendKeys("Dell laptop");
		//
		// ele.clear();
		// Thread.sleep(1000);
		//
		// driver.navigate().to("https://www.google.co.in/");
		//
		// driver.findElement(By.name("q")).sendKeys("Selenium jobs", Keys.ENTER);
		//
		// driver.navigate().back();
		// driver.navigate().back();
		// driver.navigate().forward();
		// Thread.sleep(1000);

		driver.navigate().to("https://www.phptravels.net/");

		String tit = driver.getTitle();
		System.out.println(tit);

		// TagName[contains(@attribute,'value')]
		// input[contains(@type,'submit') or @value='Log In']
		// (//input[contains(@id,'u_0') and @name='sex'])[1]
		// (//input[contains(@id,'u_0') and @name='sex'])[2]
		//text() method or function
		//*[contains(text(),'Create an account')]
		//div[@class='_52lr fsm fwn fcg' or contains(text(),'It')]
		// id ="u_0_2"
		//*[starts-with(@id,'u_0')]
		//(//*[starts-with(@id,'u_0')or @Attribut='value'])[8]
		//*[contains(text(),'Create an account')]
		//span[text()='Create an account']
		String value= "1,394.70";
		
		String xpath = "(//*[text()='Larsen']//following::td[contains(text(),'value')])[2]".replace("value", value);
		
		driver.findElement(By.xpath("(//*[@id='li_myaccount']//a[starts-with(@class,'drop')])[2]")).click();
		Thread.sleep(5000);
		
		//*[text()='May 24, 2012']//preceding::td[text()='4']

		// List<WebElement> ele = driver.findElements(By.tagName("a"));
		//
		// System.out.println("Total no of links present: " + ele.size());
		//
		// for (WebElement elem : ele) {
		// System.out.println(elem.getText());
		// }

	}

}
