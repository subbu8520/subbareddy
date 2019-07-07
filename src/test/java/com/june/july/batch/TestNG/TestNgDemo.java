package com.june.july.batch.TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;

@Listeners(ReportListener.class)
public class TestNgDemo {

	@BeforeTest
	public void openBrowser() {
		System.err.println("Open Browser");
	}

	@Test(priority=1)
	public void openURL() {
		System.out.println("Open URL");
		Reporter.log("User is opening url");
	}

	@Test(priority=2)
	public void searchProduct() {
		System.out.println("Search iphone8");
	}

	@Test(priority=3)
	public void plp() {
		System.out.println("PLP Page");
	}

	@Test(priority=4)
	public void pdp() {
		System.out.println("PDP");
	}

	@Test(priority=5)
	public void addToCart() {
		System.out.println("add to cart");
		throw new SkipException("skip..");
	}

	@Test(priority=6)
	public void addAddress() {
		System.out.println("Add address");
	}

	@Test(priority=7)
	public void paymentCOd() {
		System.out.println("Cod payment");
	}

	@Test(priority=8)
	public void logOut() {
		
		System.out.println("Logout  ");
		Assert.fail("fail");
	}

	@AfterTest
	public void closeBrowser() {
		System.err.println("closeBrowser  ");

	}

}
