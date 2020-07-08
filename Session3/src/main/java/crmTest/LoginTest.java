package crmTest;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	
	WebDriver driver;
	
	
	@Before
	
	  public void lunchbrowser()  { 
		
		  // setting up the property 
		  System.setProperty("webdriver.chrome.driver",  ".\\driver\\chromedriver.exe");
		  
		  
	  // creating web driver instance 		   
		   driver = new ChromeDriver();
	  
	  // maximizing browser 	
		  driver.manage().window().maximize();
	  
	  // get to the site 		  
	  driver.get("http://techfios.com/ibilling/?ng=admin/");
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	}
	
	  
	  @Test
	public void loginTest() throws InterruptedException{
		  
   	// identifying the username field we can use :
		  
	 WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.id("username"));
	 USERNAME_FIELD_ELEMENT.clear();
	 USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
	
	 //instead of : driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	  
	 // identifying the password field  we can use
	 By PASSWORD_FIELD_LOCATOR = By.id("password");
	 driver.findElement(PASSWORD_FIELD_LOCATOR).clear();
	 driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys("abc123");

	 //instead of using : driver.findElement(By.id("password")).sendKeys("abc123");
	 
	  //identifying the signing button and click
	  driver.findElement(By.name("login")).click();
	 
     //Stopping the browser for 2 sc	  
	  Thread.sleep(2000);
	  
	  // varType  varName = varValue;
	  //Store web element
	//  WebElement DASHBOARD_PAGE_TITLE_ELEMENT =  driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
	
	By ELEMENT_BY_LOCATOR = By.xpath("\"//h2[contains(text(),'Dashboard')]\"");

	 boolean pageTitleDisplayStatus;
	  
	  try {
		  
		  WebElement DASHBOARD_PAGE_TITLE_ELEMENT =  driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
		  pageTitleDisplayStatus = true;
		  
	  }
	  
	  catch(NoSuchElementException e){
		  
		  pageTitleDisplayStatus = false;
		  
	  }
	
	  
	  
	  
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver,5);
	// wait.until(ExpectedConditions.visibilityOfElementLocated(ELEMENT_BY_LOCATOR));
	
	  
	  // wait.until(ExpectedConditions.visibilityOf(DASHBOARD_PAGE_TITLE_ELEMENT));
	

	  
	  
	  Assert.assertTrue("Dashboard page not found", pageTitleDisplayStatus);

	  //Assert.assertTrue("Dashboard page not found", DASHBOARD_PAGE_TITLE_ELEMENT.isDisplayed());
	  
	  
	  }
	
	 	
	@After
	public void tearout() {
	
	// close the browser
	//  driver.close();
	  
	  //driver.quit();
	  
	}
	  }
	  
	 



