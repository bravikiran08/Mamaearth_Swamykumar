package HighlevelBases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
	
	public WebDriver driver;
	
	public Actions action;
	
	
  @Test
  public void clickable() {
	  
		// iframe concept by useing id or webelement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

		// Element which needs to drag.
		WebElement DragFrom = driver.findElement(By.id("draggable"));

		// Element on which need to drop.
		WebElement DropTo = driver.findElement(By.id("droppable"));

		// Using Action class for drag and drop.
		Actions act = new Actions(driver);

		// Dragged and dropped.
		act.dragAndDrop(DragFrom, DropTo).build().perform();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Personal_swamykumar\\softwares\\geckodriver.exe");
	  driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
