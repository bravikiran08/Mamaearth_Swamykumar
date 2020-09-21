package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Validation {
	
	public WebDriver driver;
	
	
  @Test
  public void valid() {
	  
	  
WebElement str = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
	  
	  System.out.println(str.getText());
	  
	  
	  if (str.getText().equalsIgnoreCase("INR")) {
		  
		  System.out.println("INR Its there! Iam Passed");
		
	} else {
		
		
		System.out.println("Doesnt matches Failed");

	}
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http:/spicejet.com");
	  driver.manage().window().maximize();
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
