package crmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		
		lunchbrowser();
		login();
		tearDown();
		
	}

	public static void lunchbrowser() {
		// setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		// creating web driver instance
		 driver = new ChromeDriver();

		// maximizing browser
		driver.manage().window().maximize();

		// get to the site
		driver.get("http://techfios.com/ibilling/?ng=admin/");

	}

	public static void login() throws InterruptedException {
		

		// identifying the username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// identifying the password field

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();

		Thread.sleep(2000);

		
	}
	
 public static void tearDown() {	
	driver.close();

}
}
