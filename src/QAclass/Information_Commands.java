package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Information_Commands {
	
	public WebDriver driver;
	
  @Test
  public void gmail() {
	  
	  String str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);
	  
  }
  
  
  
  @Test
  public void google_image() {
	  
	  
	 String str2 = driver.findElement(By.id("hplogo")).getAttribute("alt");
	 System.out.println(str2);
  }
  
  
  
  @Test
  public void searchbutton() {
	  
	String str3 =  driver.findElement(By.name("btnK")).getAttribute("value");
	System.out.println(str3);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http:/google.com");
	  driver.manage().window().maximize();
	  
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
