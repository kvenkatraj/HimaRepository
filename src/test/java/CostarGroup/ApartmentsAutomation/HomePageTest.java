package CostarGroup.ApartmentsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	
		
	@Test
	public void testSearch(){
		
		driver.findElement(By.id("quickSearchLookup")).sendKeys(" Atlanta, GA");
		driver.findElement(By.xpath("//a[@class='go']/span")).click();
		String Actualtitle = driver.getTitle();
		Assert.assertTrue(Actualtitle.contains("Atlanta GA"), "Did not take to the correct page");
					
	}
	
	@Test
	public void testSomeThing(){
		
		driver.findElement(By.id("quickSearchLookup")).sendKeys(" Atlanta, GA");
		driver.findElement(By.xpath("//a[@class='go']/span")).click();
		String Actualtitle = driver.getTitle();
		Assert.assertTrue(Actualtitle.contains("Atlanta GA"), "Did not take to the correct page");
					
	}
	
	
	
	
	
}
