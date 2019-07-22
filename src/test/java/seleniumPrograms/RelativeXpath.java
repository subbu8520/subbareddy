package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpath {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.in");
	 
		String value = "//span[text()='LOGIN']";	
		 
		
		 
		String result =  value.replace("LOGIN", "arvind");
		driver.findElement(By.xpath(result)).click();
		
		//span[contains(text(),'Hello,')]  --> min 4 char
		//span[text()='Hello, aravindanath'] --> full 
  
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}