package HighlevelBases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assert_Verify2 {
	
	public WebDriver driver;
	
  @Test
  public void fun() {
	  
	  
	//correct title is "Software Testing Material - A site for Software Testers" 
	  //We took title as "Software Testing Material" to make the test fail
	  
	  
	  String ActualTitle = "Software Testing Material";
	  String ExpectedTitle = driver.getTitle();
	  
	  //1st statement
	  System.out.println("Assertion starts here...");
	  
	  try{
		  //2nd statement--Comparing condition verification should move on.............
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
		  
		  }catch (Throwable t){
			//3rd statement  
		  System.out.println("A blog for Software Testers");
		  }
		  driver.quit();
		  }
		  
	 
	  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
	  driver = new FirefoxDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
