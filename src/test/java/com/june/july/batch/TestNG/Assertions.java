package com.june.july.batch.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends LaunchBrowser{

	//@Test
	public void hardAssert() {
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "Title mismatch..");
		System.out.println("Starting....");
		driver.get("https://www.google.in");

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
