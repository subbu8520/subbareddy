package com.june.july.batch.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.*;


public class TestNgDemo3 extends LaunchBrowser{

	@BeforeMethod
	public void report() {
		System.out.println("****** Before method Report ******");
	}
 
	@AfterMethod
	public void afterReport() {
		System.out.println("****** After method Report ******");
	}
	@Test()
	public void searchProduct() {
		System.out.println("Search iphone8");
	}

	@Test(dependsOnMethods ="searchProduct")
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
	}

	@Test 
	public void logOut() {
		System.out.println("Logout  ");
	}

	 
}
