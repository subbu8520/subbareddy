package com.june.july.batch;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGAnnotation {

	@Test()
	public void openBrowser() {
		
		System.err.println("Open Browsers case");
		//throw new SkipException("Skipping Open browser");
		//Assert.fail("Failing this method");
	//	Assert.fail();
	}

	@Test(priority =1 , dependsOnMethods= {"openBrowser"},enabled = false)
	public void login() {
		System.out.println("Login case");
	}

	@Test(priority =2 )
	public void search() {
		System.out.println("Search case");
	}

	@Test(priority =3 )
	public void pdpPage() {
		System.out.println("PDP case");
	}

	@Test(priority =4 )
	public void addCart() {
		System.out.println("Add Cart case");
	}

	@Test(priority =5 )
	public void address() {
		System.out.println("Address case");
	}

	@Test(priority =6 )
	public void payment() {
		System.out.println("Payment case");
	}

	@Test(priority =7 )
	public void logOut() {
		System.out.println("Logout case");
	}

	@AfterTest
	public void closeBrowser() {
		
		System.err.println("Close Browsers case");
	}

}
