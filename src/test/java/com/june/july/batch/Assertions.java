package com.june.july.batch;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends LaunchBrowser{

	//@Test(priority=1)
	public void demoAssert() {
		System.out.println("Starting....");
		int x = 10;
		Assert.assertEquals(100, x);

		System.out.println("ending.....");

	}

	@Test
	public void softAssertion() {
		System.out.println("Starting....");
		driver.get("https://www.google.in");
		
		String actual = driver.getTitle();;
		System.out.println(actual);
				//Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
		SoftAssert sf =  new SoftAssert();
		
		 sf.assertEquals(actual, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
		System.out.println("ending.....");
		
		sf.assertAll();
		
	}
}
