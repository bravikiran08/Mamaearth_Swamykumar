package HighlevelBases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestXLSX {
	
	public WebDriver driver;
	
  @Test
  public void XLSX() throws Exception {
	  
	  
	     File src=new File("D:\\Personal_swamykumar\\Test Data\\Gamas.xlsx");
	      
	     // Load the file
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load the workbook
	    XSSFWorkbook workbook = new XSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored
	    XSSFSheet s = workbook.getSheetAt(0);

		String username = s.getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
		
		driver.findElement(By.id("identifierId")).sendKeys(username);
		
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		 Thread.sleep(8000);


			
		String password = s.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
		Thread.sleep(10000);
		
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://gmail.com");
	  Thread.sleep(3000);
	  
		
  }

  @AfterTest
  public void afterTest() {
  }

}
