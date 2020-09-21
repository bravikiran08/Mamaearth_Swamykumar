package HighlevelBases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayGeneric {
	
	public WebDriver driver;
	
	public Actions action;
	
	
	public void generic(String str) throws Exception{
		action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(str));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);	
	}
	
	
	
  @Test
  public void clickable() throws Exception {
	  
	  for (int i = 1; i < 7; i++) {
	
	  generic("//*[@id=\"container\"]/div/div[2]/div/ul/li["+i+"]/span");
	  
                                   }
	  
	  
  }
	  
	 
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
