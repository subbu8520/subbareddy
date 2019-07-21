package recordVideos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SynchronisationExamples {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.myntra.com/login");
		// Implicitly wait, will waits dynamically 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		//driver.manage().timeouts().setScriptTimeout(10,  TimeUnit.NANOSECONDS);
		// Thread.sleep will explicitly wait till given time
	}

	@Test
	public void myntra() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='email' or @name='email']")).sendKeys("aravindanath.dm@myntra.com");
		driver.findElement(By.xpath("//input[@type='password' or @name='password']")).sendKeys("myntra123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		//
	}

	@AfterTest
	public void closeBrowser() {

		driver.quit();

	}
}
