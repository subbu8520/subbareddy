package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class ByName {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium jobs in bangalore",Keys.ENTER);
 
		Thread.sleep(3000);
	}

  @AfterTest
	public void closeBrowser() {
		driver.close();
		// driver.quit();

	}
}
