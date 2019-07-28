package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBw {
	WebDriver driver;
	
	@BeforeTest
	public void launchBw() {// for windows /Users/aravindanathdm/Documents/Aravinda/chromedriver.exe
	System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
	
	ChromeOptions ops =  new ChromeOptions();
	ops.addArguments("--disable-notifications");
	ops.addArguments("disable-infobars");
	ops.addArguments("--incognito");
	
	
	driver = new  ChromeDriver(ops);
		
	}
	
	@Test
	public void test() {
		driver.get("https://www.icicibank.com");
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
