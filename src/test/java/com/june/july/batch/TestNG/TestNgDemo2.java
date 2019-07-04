package com.june.july.batch.TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ReportITestListener.class)
public class TestNgDemo2 extends LaunchBrowser{

	@Test()
	public void searchProduct() {
		System.out.println("Search iphone8");
	}

	@Test 
	public void plp() {
		System.out.println("PLP Page");
	}

	@Test 
	public void pdp() {
		System.out.println("PDP");
	}

	@Test 
	public void addToCart() {
		System.out.println("add to cart");
	}

	@Test 
	public void addAddress() {
		System.out.println("Add address");
	}

	@Test
	public void paymentCOd() {
		System.out.println("Cod payment");
		throw new SkipException("Skiping this methods..");
		
	}

	@Test 
	public void logOut() {
		System.out.println("Logout  ");
		Assert.fail("Fail...");
	}

	 
}
