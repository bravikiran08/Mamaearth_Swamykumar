package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class PrintAll_options {
	
	public WebDriver driver;
	
  @Test
  public void options() {
	  
	 List<WebElement> values = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
	 
	 System.out.println(values.get(0).getText());
	 
	 if (values.get(1).getText().contains("usd")) {
		 
		 System.out.println(values.get(1).getText());
		 
		 System.out.println("passed");
		
	} else {
		
		System.out.println("Failed");

	}
	 
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http:/spicejet.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
