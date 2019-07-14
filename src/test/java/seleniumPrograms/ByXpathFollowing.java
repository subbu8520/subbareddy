package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByXpathFollowing {
	WebDriver driver;

	@Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops =  new ChromeOptions();
		ops.addArguments("--disable-notifications");
		driver = new ChromeDriver(ops);
		driver.manage().window().fullscreen();
		String mk = "Sensex";
		driver.get("https://www.marketwatch.com/investing/index/comp");
		String market = "//*[text()='MARKETNAME']//following::td[1]";
		String result = market.replace("MARKETNAME", mk);
		WebElement asia = driver.findElement(By.xpath(result));
		System.out.println(asia.getText());
		
		 
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		// driver.quit();

	}
}
