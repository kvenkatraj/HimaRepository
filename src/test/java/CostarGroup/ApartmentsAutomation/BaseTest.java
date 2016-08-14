package CostarGroup.ApartmentsAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:/Hima/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.apartments.com/");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();	
		
	}
	

}
