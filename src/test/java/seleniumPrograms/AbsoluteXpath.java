package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsoluteXpath {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/div/div/div/input")).sendKeys("selenium jobs");
		 
  
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}