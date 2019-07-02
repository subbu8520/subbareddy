package com.june.july.batch;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reports2 extends LaunchBrowser {
	
	@Test
	public void amazon() {
		Reporter.log("User is launching amazon");
		driver.get("https://www.amazon.com");
		Reporter.log("Amazon site launched");
		
	}

}
