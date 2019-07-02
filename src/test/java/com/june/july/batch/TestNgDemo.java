package com.june.july.batch;

import org.testng.annotations.Test;
import org.testng.annotations.*;


public class TestNgDemo {

	@BeforeTest
	public void openBrowser() {
		System.err.println("Open Browser");
	}

	@Test(priority=1)
	public void openURL() {
		System.out.println("Open URL");
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
	}

	@AfterTest
	public void closeBrowser() {
		System.err.println("closeBrowser  ");

	}

}
