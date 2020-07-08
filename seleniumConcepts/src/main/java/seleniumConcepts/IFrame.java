package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class IFrame {

	WebDriver driver;

	@Before

	public void lunchbrowser() {

		// setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		// creating web driver instance
		driver = new ChromeDriver();

		// maximizing browser
	//	driver.manage().window().maximize();

		// get to the site
		driver.get("https://docs.oracle.com/javase/8/docs/api/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	

	@Test
	public void lunch() throws InterruptedException {

		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();
		
	
		
		String act_title1 = driver.getTitle();
		System.out.println(act_title1);
		
		String expected_title="Interface Adjustable";
		
	 // Assert.assertEquals("page not found", expected_title, act_title);

		
		
		Thread.sleep(2000);
		// here we have to return to our default content
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Adjustable")).click();
		
		String act_title2 = driver.getTitle();
		System.out.println(act_title2);
		
		Thread.sleep(2000);

//		
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(2);
//		Thread.sleep(2000);
//
//		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("java.sql")));
//		
//		
		
		
		
		//String act_title = driver.getTitle();
		
//		String act_title = driver.getTitle();
//		
//		
//		String expected_title="Interface Adjustable";
//		
	
	//	Assert.assertEquals("page not found", expected_title, act_title);
		
		
	

		/*
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.applet")).click();

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AudioClip")).click();

		Thread.sleep(2000);
		driver.findElement(By.linkText("Applet")).click();

		// Thread.sleep(1000);
		  
		 
	
		 *
		 */
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
