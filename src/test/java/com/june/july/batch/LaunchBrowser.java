package com.june.july.batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.*;

public class LaunchBrowser {
	protected WebDriver driver;
	//@BeforeSuite
	@BeforeClass
	public void launchBrowser() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
				"/Users/aravindanathdm/Documents/Aravinda/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		 
		System.err.println("******** Open browser **********");

		System.err.println("******** URL **********");
	}

//	@AfterSuite
	@AfterClass
	public void closeBrowser() {
		System.err.println("******** close browser **********");
		driver.quit();
		 
	}
}
