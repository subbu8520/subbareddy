package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartsWithXapth {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[starts-with(@class,'gLFy')]")).sendKeys("arvind@gmail.com");
		
		Thread.sleep(2000);
		 
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}