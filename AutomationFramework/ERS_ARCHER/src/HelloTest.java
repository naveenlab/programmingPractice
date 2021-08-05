import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World");
			System.setProperty("webdriver.chrome.driver", "D:\\Naveen\\Software\\chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.get("https://google.com");
			String str = driver.getTitle();
			System.out.println("Google Title is "+ str);
			
			
	}

}
