package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByXpathBasic {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.moneycontrol.com/commodity/");
		Thread.sleep(2000);
		String g = "31,492.00";
		String val = "//*[@class='mctable1'])[2]/tbody/tr[1]/td//following::td[@align='center'][text()='GOLD']"
				.replace("GOLD", g);
		String gold = driver.findElement(By.xpath(val)).getText();
		System.out.println("Gold value :" + gold);

		
		//
	}//

	// @AfterTest
	public void closeBrowser() {
		driver.close();
		// driver.quit();

	}
}
