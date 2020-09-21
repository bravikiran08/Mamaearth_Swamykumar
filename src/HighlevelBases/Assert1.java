package HighlevelBases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assert1 {
	
	public WebDriver driver;
	
  @Test
  public void fun() {
	  
	  
	//Correct title is "Welcome: Mercury Tours" 
	  //We took title as "Software Testing Material" to make the test fail
	 
	  
	  
	  String ActualTitle = "Mercury Tours";
	  String Expected = driver.getTitle();
	  
	  //1st statement
	  System.out.println("Assertion starts here...");
	  
	  //2nd Statement
	  Assert.assertEquals(ActualTitle, Expected);
	  
	  
	  
	  //3rd Statement
	  System.out.println("A blog for Software Testers");
	  
	  
	                 driver.quit(); 
	               
	                 
	  }
	 
	  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
