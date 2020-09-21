package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Popupwindows {
	
	public WebDriver driver;
	public Actions action;
	
	
	
  @Test
  public void mouseover() throws Exception {
	  
	  action = new Actions(driver);
	  
	  WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	  
	  //Action command
	  action.moveToElement(ele).build().perform();
	  
	  //windows
	  driver.findElement(By.linkText("Windows")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	  
	//Parent window handle
	  String moveto_parentwindow = driver.getWindowHandle();
	  
	  
	  //Child window handle
	  for(String winhandle : driver.getWindowHandles()) {
		  
		  
		  driver.switchTo().window(winhandle);
		  Thread.sleep(3000);
	  }
	  
	  driver.findElement(By.linkText("Support")).click();
	  
	  driver.close();
	  
	  
	  Thread.sleep(3000);
	  
	  
	  driver.switchTo().window(moveto_parentwindow);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.linkText("Home")).click();
	  
	  
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
  }

  
  @AfterTest
  public void afterTest() {
	  
	  
  }

}
