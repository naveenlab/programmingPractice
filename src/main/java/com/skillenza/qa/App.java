package com.skillenza.qa;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://return-order-app.herokuapp.com/";
        driver.get(baseUrl);
        WebElement orderId_Field = driver.findElement(By.id("order-id"));
        orderId_Field.sendKeys("1257945872");
        driver.findElement(By.xpath("//button[text()='Find Order']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Return This Product']")).click();
        Thread.sleep(6000);
        String result_str= driver.findElement(By.xpath("//div[@class='output']/div[@class='result']")).getText();
        
        try {
        	FileWriter myWriter = new FileWriter("result.txt");
            myWriter.write(result_str);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.close(); 
    }
}
