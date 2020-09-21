package QAclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit {
	
public WebDriver driver;
	
	
@Test
 public void fun() throws Exception {
	
	

		
		  WebElement ele = driver.findElement(By.id("myFile"));
		  
		  ele.sendKeys("C:\\Users\\Charvik\\Desktop\\gv.png");
		 
		  
		/*
		 * driver.findElement(By.id("myFile")).click(); Thread.sleep(3000);
		 * 
		 * 
		 * //Auto IT Concept
		 * Runtime.getRuntime().exec("C:\\Users\\Charvik\\Desktop\\Ponds.exe");
		 */
		  

 }



  
  @BeforeTest
  public void beforeTest() throws Exception {
	 
		System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		  
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
