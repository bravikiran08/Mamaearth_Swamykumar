package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Mouseover {
	
	public WebDriver driver;
	public Actions action;
	
	
	
  @Test
  public void mouseover() throws Exception {
	  
	  action = new Actions(driver);
	  
	  WebElement ele1 = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	  
	  //Action command
	  action.moveToElement(ele1).build().perform();
	  
	  
	  
  WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[16]/ul/li[2]/a"));
	  
	  //Action command
	  action.moveToElement(ele2).build().perform();
	  
	  //Clicking on Frames
	  driver.findElement(By.linkText("Member Login")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
