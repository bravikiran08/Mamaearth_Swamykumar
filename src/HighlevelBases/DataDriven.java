package HighlevelBases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public WebDriver driver;

	@Test
	public void data() throws Exception, Exception {

		
		  FileInputStream fi = new FileInputStream("D:\\Personal_swamykumar\\Test Data\\Gfive.xls"); 
		  Workbook wb = Workbook.getWorkbook(fi);
		  Sheet s = wb.getSheet("Gmail");
		 

		driver.findElement(By.id("login_field")).sendKeys(s.getCell(0, 1).getContents());
		 

		driver.findElement(By.id("password")).sendKeys(s.getCell(1, 1).getContents());

		Thread.sleep(10000);

		driver.findElement(By.name("commit")).click();
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://github.com/login?return_to=%2Flogins");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

	}

}
