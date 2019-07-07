package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBw {
	WebDriver driver;
	
	@BeforeTest
	public void launchBw() {// for windows /Users/aravindanathdm/Documents/Aravinda/chromedriver.exe
	System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
	driver = new  ChromeDriver();
		
	}
	
	@Test
	public void test() {
		driver.get("https://www.amazon.com");
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
