package HighlevelBases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintLinks {
	
	public WebDriver driver;
	
  @Test
  public void clickable() {
	  
	  driver.findElement(By.name("q")).sendKeys("Google");
	  
		 List<WebElement> allvalueslist = driver.findElements(By.xpath("//ul[@role='listbox']"));
			
		  for (int i = 0; i < allvalueslist.size(); i++) {
			  
			 // System.out.println(allvalueslist.get(i).getText());
			  
			  String str = allvalueslist.get(i).getText();
			  System.out.println(str);
			  
			  if (allvalueslist.get(i).getText().contains("google translate")) {
				  
				  allvalueslist.get(i).click();
				   break;	  
				
			}
		  }
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Personal_swamykumar\\softwares\\chromedriver.exe"); driver = new
		 * ChromeDriver();
		 */
	  System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
	  driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
