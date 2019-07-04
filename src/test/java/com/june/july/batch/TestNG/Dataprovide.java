package com.june.july.batch.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovide {
	
	
	@Test(dataProvider="getLoginData")
	public void login(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	
	@Test(dataProvider="getsearchData")
	public void search(String val) {
		System.out.println(val);
		System.out.println(val);
		
	}
	
	
	@DataProvider
	public Object[][] getLoginData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "arvind@gmail.com";
		data[0][1] = "arvin341243";
		data[1][0] = "jyothi@gmail.com";
		data[1][1] = "3adfae3";
		return data;
		
	}

	
	@DataProvider
	public Object[][] getsearchData(){
		Object[][] data = new Object[2][1];
		data[0][0] = "iphone";
		data[1][0] = "samsung";
	 
		return data;
		
	}
}
