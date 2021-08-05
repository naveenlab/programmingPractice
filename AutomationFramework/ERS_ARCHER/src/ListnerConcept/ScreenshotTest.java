package ListnerConcept;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomeListner.class)
public class ScreenshotTest extends BaseTest {
	
	

	@BeforeMethod
	public void setup() {
		initialize();

	}
	
	
	@Test
	public void screenshotTest1() {
		Assert.assertEquals(false, true);		
	}
	
	@Test
	public void screenshotTest2() {
		Assert.assertEquals(false, true);		
	}
	
	@Test
	public void screenshotTest3() {
		Assert.assertEquals(false, true);		
	}
	
	@Test
	public void screenshotTest4() {
		Assert.assertEquals(false, true);		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
