package crmTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	
	  WebDriver driver;
	  
	  @Test
	  
	  public void lunchbrowser() throws InterruptedException { 
		  // setting up the property
		  
		  System.setProperty("webdriver.chrome.driver",  ".\\driver\\chromedriver.exe");
	  
	  // creating web driver instance driver = new ChromeDriver();
	  
	  // maximizing browser driver.manage().window().maximize();
	  
	  // get to the site driver.get("http://techfios.com/ibilling/?ng=admin/");
	  
	  // identifying the username field
		  
	  driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	  
	 // identifying the password field
	  
	  driver.findElement(By.id("password")).sendKeys("abc123");
	  
	  driver.findElement(By.name("login")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.close();
	  
	  }
	  
	 

//	WebDriver driver;
//
//	@Before
//	public void lunchbrowser() {
//		// setting up the property
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
//
//		// creating web driver instance
//		driver = new ChromeDriver();
//
//		// maximizing browser
//		driver.manage().window().maximize();
//
//		// get to the site
//		driver.get("http://techfios.com/ibilling/?ng=admin/");
//
//	}

//	@Test
//	public void login() throws InterruptedException {
//
//		// identifying the username field
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//
//		Thread.sleep(2000);
//
//		// identifying the password field
//
//		driver.findElement(By.id("password")).sendKeys("abc123");
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.name("login")).click();
//
//		Thread.sleep(2000);
//
//	}
//
//	@Test
//	public void luchbrowser() throws InterruptedException {
//
//		driver.get("https://objectspy.space/");
//
//		driver.findElement(By.id("sex-1")).click();
//
//		Thread.sleep(2000);
//
//	}
//
//	@After
//	public void tearDown() {
//		driver.close();
//
//	}

}