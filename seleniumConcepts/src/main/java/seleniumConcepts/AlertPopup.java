package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

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
		driver.get("https://docs.oracle.com/javase/8/docs/api/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void LoginTest() throws InterruptedException {
//		
//		driver.findElement(By.xpath("//input[@name='proceed']")).click();
//		Thread.sleep(1000);
//		String alertMessage = driver.switchTo().alert().getText();
//		System.out.println(alertMessage);
//		driver.switchTo().alert().accept();
	}

}
