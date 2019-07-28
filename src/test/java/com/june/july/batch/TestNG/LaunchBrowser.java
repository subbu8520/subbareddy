package com.june.july.batch.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class LaunchBrowser {
	protected   WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
				"/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("disable-infobars");
		ops.addArguments("--disable-notifications");
		 

		driver = new ChromeDriver(ops);
		driver.manage().window().fullscreen();
	}

	@AfterClass
	public void closeBrowser() {

		driver.quit();

	}
}
