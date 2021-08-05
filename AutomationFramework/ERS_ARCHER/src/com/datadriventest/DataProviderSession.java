package com.datadriventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSession {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Naveen\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		
		Object[][] data = new Object[3][2]; 
		data[0][0] = "Rama";
		data[0][1] = "kumar";
		data[1][0] = "Naveen";
		data[1][1] = "kumar";
		data[2][0] = "Varsha";
		data[2][1] = "kumari";
		
		
		return data;
		
	
		 
	}
	
	@Test(dataProvider = "getData")
	public void login(String firstname, String lastname) {
		
		
		
		  driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		  driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		 
		 
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
