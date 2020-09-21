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

public class INR_optionsvalidation {
	
	public WebDriver driver;
	
  @Test
  public void options() {
	  
	 List<WebElement> allvalues = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
	 

//0)Select 1)INR 2)AED 3)USD
for (int i = 0; i < allvalues.size(); i++) {
		 
		// System.out.println(allvalues.get(i).getText());
		 
		 
		 if (allvalues.get(i).getText().equalsIgnoreCase("USD")) {
			 
			 System.out.println(allvalues.get(i).getText());
			 
			 System.out.println("Pass");
			
			} 
				  else {
				  
				  System.out.println("Validation fails");
				  
				  }
				 
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
