package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicXpath {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@value='Log In']//preceding::input[2]")).sendKeys("arvind@gmail.com");
		//TAGNAME[@Atr='Value']
		//input[@name='q']
		//input[@class='nav-input' and @value='Go']
		//input[@Text='ok' or @Text='Ok' or @Text='OK or @Text='oK']
		//input[contains(@id,'threetabthe')]
		//*[contains(text(),'Introducing On-Time Guarantee')]
		//input[starts-with(@class,'gLFyf')]  gLFyf gsfi
		//*[text()='Google offered in:  ']
		//input[@id='pass']//following::input[@id="xyz]
		//input[@value='Log In']//preceding::input[@id='email']
		//input[@value='Log In']//preceding::input[2]
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}