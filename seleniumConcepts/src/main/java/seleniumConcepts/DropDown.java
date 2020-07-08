package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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
		driver.get("http://techfios.com/ibilling/?ng=admin/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Test
	public void lunch() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();

		driver.findElement(By.xpath("//*[@id='side-menu']/li[3]/a/span[1]")).click();

		driver.findElement(By.xpath("//*[@id='side-menu']/li[3]/ul/li[1]/a")).click();

		WebElement COUNTRY_DROPDOWN_LOCATOR = driver.findElement(By.xpath("//select[@id='country']"));

		Select sel = new Select(COUNTRY_DROPDOWN_LOCATOR);

		sel.selectByVisibleText("Algeria");

	}

}
