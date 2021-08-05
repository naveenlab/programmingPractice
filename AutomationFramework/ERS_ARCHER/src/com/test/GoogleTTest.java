package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleTTest {

	
	WebDriver driver;

	@BeforeMethod
	public void setup(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Naveen\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		

	}

	@Test
	public void verifyTitile() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	
	  @Test
	  public void verifyLogo(){ 
		  boolean isLogoDisplayed = driver.findElement(By.xpath("//img[@id ='hplogo']")).isDisplayed();
	  
	  
	  }
	  
		
		  @Test public void validateGoogleSearchButton() { boolean isLogoDisplayed =
		  driver.findElement(By.xpath("//input[@aria-label='Google Search']")).
		  isDisplayed();
		  
		  
		  }
		 
	 

	@AfterMethod
	public void tearDown() {
		System.out.println("*************Closing Browser**************");
		driver.quit();
	}

}
