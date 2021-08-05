package com.test;

import org.testng.annotations.Test;

public class TestNgFeature {
	
	@Test(priority = 1, groups = "loginTest" )
	public void loginTest() { 
		System.out.println("loginTest");
	}
	
	@Test(priority = 2, groups = "features", dependsOnMethods = "loginTest")
	public void searchPage() {
		System.out.println("searchPage");
	}
	
	@Test(priority = 3, groups = "features", dependsOnMethods = "loginTest")
	public void filterPage() {
		System.out.println("filterPage");
	}
	
	@Test(priority = 4, groups = "features", dependsOnMethods = "loginTest")
	public void registration() {
		System.out.println("registrationPage");
	}
	
	@Test(priority = 5, groups = "features", dependsOnMethods = "loginTest")
	public void addBasketPage() {
		System.out.println("addBasketPage");
	}

}
