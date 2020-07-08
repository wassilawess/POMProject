package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	WebDriver driver;

	@Before

	public void lunchbrowser() {

		// setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		// creating web driver instance
		driver = new ChromeDriver();

		// maximizing browser
		driver.manage().window().maximize();

		// get to the site
		driver.get("https://www.dell.com/en-us");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Test
	public void lunch() throws InterruptedException {

		Actions act = new Actions(driver);

		WebElement PRODUCTS_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id='l1']"));

		WebElement MONITORS_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id='l1_6']"));

		WebElement MONITORS_FOR_HOME_LOCATOR = driver.findElement(By.xpath("//*[@id='dell-masthead']/div[3]/nav/ul/li[1]/ul/li[9]/ul/li[2]/a/img"));
	
		//*[@id="dell-masthead"]/div[3]/nav/ul/li[1]/ul/li[8]/ul/li[1]/a/span[1]
		//*[@id="dell-masthead"]/div[3]/nav/ul/li[1]/ul/li[9]/ul/li[1]/a/img
																			
	
	Actions action = new Actions(driver);
	
	action.moveToElement(PRODUCTS_MENU_LOCATOR).build().perform();
	
	action.moveToElement(MONITORS_MENU_LOCATOR).build().perform();

	MONITORS_FOR_HOME_LOCATOR.click();
	
	/*
	
	MouseHover mh = new MouseHover();
	
	mh.lunchbrowser();
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
