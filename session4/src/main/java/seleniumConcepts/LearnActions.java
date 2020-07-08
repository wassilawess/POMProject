package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	WebDriver driver;

	@Before

	public void lunchbrowser() throws InterruptedException {

		// setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		// creating web driver instance
		driver = new ChromeDriver();

		// maximizing browser
		driver.manage().window().maximize();

		// get to the site
		driver.get("http://techfios.com/ibilling/?ng=admin/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Test
	public void lunch() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		// instead of using this mth : driver.findElement(By.name("login")).click();
		// in click button we use the keyboard key

		Actions act = new Actions(driver);
		

		//we can use return or enter
	
		//act.sendKeys(Keys.RETURN).build().perform();

		act.sendKeys(Keys.ENTER).build().perform();
	}
}
