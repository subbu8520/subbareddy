package SeleniumMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDropdownExample {

	WebDriver driver;

	@BeforeTest
	public void openBrowser()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		// Page load
		driver.get("https://www.wikipedia.org/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 
	
	}
	
	@Test
	public void selectDropdown() throws InterruptedException  {
		Thread.sleep(2000);
		WebElement dp = driver.findElement(By.id("searchLanguage"));
		dp.sendKeys("Dansk");
		Thread.sleep(2000);
		
		Select sc =  new Select(dp);
		sc.selectByIndex(29);
		Thread.sleep(2000);
		
		sc.selectByValue("hy");
		Thread.sleep(2000);
		
		sc.selectByVisibleText("हिन्दी");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
		
		System.out.println("Total no of Languages: "+list.size());
		
		for (WebElement web : list) {
			System.out.println(web.getText());
		}
		
		
		
	}
	
	

	// @Test
	public void dropDown() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("searchLanguage"));
		Thread.sleep(2000);
		ele.sendKeys("Deutsch");
		Thread.sleep(2000);

		Select sc = new Select(ele);
		sc.selectByIndex(10);
		Thread.sleep(2000);
		sc.selectByValue("ta");
		Thread.sleep(2000);
		sc.selectByVisibleText("中文");
		Thread.sleep(2000);
		List<WebElement> option = sc.getOptions();
		System.out.println("Total no of Lang: " + option.size());

		for (WebElement ref : option) {
			System.out.println(ref.getText());
			if (ref.getText().equals("ภาษาไทย")) {
				ref.click();
				System.out.println("Lang found!");
			} else {
				System.out.println("Lang not found!");
			}

		}

		// for (WebElement web : option) {
		// if(web.getText().equals("ქართული")) {
		// web.click();
		// System.out.println("Lang "+ web.getText() +" found!");
		// break;
		// }else {
		// System.out.println("Lang not found!");
		// }
		// }

		// @Test
		// public void printAllLinks() throws InterruptedException {
		//
		// // List<WebElement> list = driver.findElements(By.id("SIvCob"));
		// // System.out.println("Number of Links : "+list.size());
		// // for (int i = 0; i < list.size(); i++) {
		// // //System.out.println(list.size());
		// // System.out.println(list.get(i).getText());
		// // // System.out.println(list.get(i).getAttribute("href"));
		// // }
		//
		// WebElement ele = driver.findElement(By.xpath("//div[@class='footer']"));
		// List<WebElement> l = ele.findElements(By.tagName("a"));
		//
		//
		//
		// for (int i = 0; i < l.size(); i++) {
		// System.out.println(l.get(i).getText());
		// System.out.println(l.get(i).getAttribute("href"));
		// }
	}

	@AfterTest
	public void close() {
		driver.quit();
		;
	}
}
