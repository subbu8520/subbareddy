package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByXpathPreceding {
	WebDriver driver;

	@Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[text()='Female']//preceding::input[1]")).click();
		 
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		// driver.quit();

	}
}
