package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Array {
	
	public WebDriver driver;
	
  @Test
  public void fun() throws Exception {
	  
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  
	  String str = driver.findElement(By.xpath("//ul[@role='listbox']")).getText();
	  
	  System.out.println(str);
	  
	  System.out.println(str.length());
	  
	 String a[] = str.split("\n");
	 
	 System.out.println(a);
	 System.out.println(a.length);
	 
	 
	 for (int i = 0; i < a.length; i++) {
		 
		 if (a[i].equalsIgnoreCase("selenium Testing")) {
			 
			 Thread.sleep(3000);
			 System.out.println(a[i]);
			 break;
			
		}
		 
		 driver.findElement(By.name("q")).clear();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.name("q")).sendKeys(a[i]);
		 Thread.sleep(3000);
	}
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
