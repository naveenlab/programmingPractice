package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class Parameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader reader = new Xls_Reader("C:\\Users\\navee\\AutomationFramework\\ERS_ARCHER\\src\\com\\testdata\\EbayTestData.xlsx");
		int rowCount = reader.getRowCount("registraion");
		reader.addColumn("registraion", "status");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Naveen\\Software\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		for(int rownum = 2; rownum<=rowCount; rownum++) {
			String firstName = reader.getCellData("registraion", "firstName", rownum);
			System.out.println(firstName);
			String lastName = reader.getCellData("registraion", "LastName", rownum);
			System.out.println(lastName);
			String email = reader.getCellData("registraion", "email", rownum);
			System.out.println(email);
			String password = reader.getCellData("registraion", "password", rownum);
			System.out.println(password);
			
			 
			/*
			 * driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
			 * driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
			 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			 * driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password) ;
			 */
			 reader.setCellData("registraion", "status", rownum, "pass");
		}
		

	} 

}
