package BankAndCash;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class AddNewAcount {
	
	WebDriver driver;

	@BeforeMethod
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

}
