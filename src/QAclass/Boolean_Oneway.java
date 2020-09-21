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

public class Boolean_Oneway {
	
	public WebDriver driver;
	
  @Test
  public void options() {
	  
	  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]")).click();
	  
	  	  
	boolean printcondition = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]")).isDisplayed();
	  
	System.out.println(printcondition);
	
	
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]"));
	
	
			
			if (element.isEnabled()) {
				
				System.out.println("Passed");
				
			} else {
				
				System.out.println("Failed");

			}
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http:/savaari.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
