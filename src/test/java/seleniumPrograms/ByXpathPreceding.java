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
		driver.findElement(By.xpath("//input[@id='u_0_8']//preceding::td/input[@id='email']")).sendKeys("dummy");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dummy");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.navigate().back();					////*[text()='Birthday']
		String text = driver.findElement(By.xpath("//*[contains(text(),'Create an account')]")).getText();
		Assert.assertEquals("Create an account", text);
		
		driver.findElement(By.xpath("//*[contains(@name,'first')]")).sendKeys("arvind");
		driver.findElement(By.xpath("//*[starts-with(@name,'las')]")).sendKeys("sharma");
		Boolean b = driver.findElement(By.xpath("//*[text()='Birthday']")).isDisplayed();
		System.out.println("Birthday is "+ b);
	}////a[text()='Zee Entertain' and @title='equity']//following::td

	@AfterTest
	public void closeBrowser() {
		driver.close();
		// driver.quit();

	}
}
