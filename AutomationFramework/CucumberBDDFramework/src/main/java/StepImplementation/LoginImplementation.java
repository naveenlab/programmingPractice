package StepImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;





public class LoginImplementation {
	
WebDriver driver;	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page(){
	    
		 
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		
		
	    
	}

	
	@When("^Title of Login page is FreeCRM$")
	public void title_of_Login_page_is_FreeCRM(){
	    // Write code here that turns the phrase above into concrete actions
		String Actualtitle = driver.getTitle();
		Assert.assertEquals("Free CRM #2 cloud software for any business large or small", Actualtitle);   
	}

	@Then("^User enters username$")
	public void user_enters_username_and_password(){
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("username")).sendKeys("naveenk");
	    
	}

	@Then("^User enters password$")
	public void user_enters_password(){
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys("test@123");
	}

	@And("^User is on the Home Page$")
	public void user_is_on_the_Home_Page(){
	    // Write code here that turns the phrase above into concrete actions
	    String title = driver.getTitle();
	    Assert.assertEquals("CRMPO", title);
	    		
	}
	
	@Then("^User click on login button$")
	public void clickOnLogin() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
		
	}

}
