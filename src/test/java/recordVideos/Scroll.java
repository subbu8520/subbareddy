package recordVideos;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 
public class Scroll {

	static WebDriver driver;


	@BeforeTest
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		// Page load
		// driver.get("https://www.wikipedia.org/");
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(description = "Invalid Login Scenario with wrong username and password.")
	public void homePage() throws InterruptedException, IOException {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//span[text()='Back to top']")));
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Back to top']"));

		ele.click();

	}

	// now execute query which actually will scroll until that element is not
	// appeared on page.
	/*
	 * https://www.softwaretestingmaterial.com/javascriptexecutor-selenium-
	 * webdriver/
	 */
	public void scrollTillElement() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[text()='Make Money with Us']"));
		je.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void scrollTillElementFound(String ele) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement((By.xpath(ele)));
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void scroll() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("scroll(0,5000)");
		// ((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
	}

	 

}
