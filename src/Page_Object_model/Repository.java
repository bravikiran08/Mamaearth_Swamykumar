package Page_Object_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Repository {
public static WebDriver driver;
	
	//login
	@Test(priority = 1)
	public static void login() throws Exception {
		
		driver.findElement(Locators.username).sendKeys(TestData.username);
		driver.findElement(Locators.Password).sendKeys(TestData.Password);
		driver.findElement(Locators.click).click();
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	@BeforeTest
	public static void setup() {
		
		
		 System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
		  driver = new FirefoxDriver();
			driver.get(TestData.url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );  
		  
	}
	
	@AfterTest
	public static void teardown() {
		
	}
}