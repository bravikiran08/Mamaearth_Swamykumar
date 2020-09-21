package Grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Cross  {

	public WebDriver driver;
	
	@Test
	@org.testng.annotations.Parameters("browser")
	public void VerifyTitlepage(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe"); 
			driver = new FirefoxDriver();
		}

		
	else if (browserName.equalsIgnoreCase("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe"); 
		  driver = new ChromeDriver();
			
		}
		
	else if (browserName.equalsIgnoreCase("IE")) 
	{
			System.setProperty("webdriver.IE.driver", "D:\\workspace\\lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
	}
		
		
		else if (browserName.equalsIgnoreCase("UC")) 
		{
				System.setProperty("webdriver.IE.driver", "D:\\workspace\\lib\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
		}
		
		
		else if (browserName.equalsIgnoreCase("Safari")) 
		{
				System.setProperty("webdriver.IE.driver", "D:\\workspace\\lib\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
		}
	
	}
}