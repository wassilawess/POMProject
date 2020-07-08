
package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleNewTab {

	WebDriver driver;

	@Before
	public void lunchbrowser() {

		// setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		// creating web driver instance
		driver = new ChromeDriver();

		// maximizing browser
		// driver.manage().window().maximize();

		// get to the site
		driver.get("https://www.yahoo.com/");

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Test
	public void SEARCHfORxPATHiNyAHOO() throws InterruptedException {
		By SEARCH_FIELD_LOCATOR = By.cssSelector("input#header-search-input");

		By W3_LINK_LOCATOR = By.linkText("XPath Tutorial - W3Schools");
		By Sql_LINK_LOCATOR = By.linkText("SQL");

		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys("xpath");

		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys(Keys.ENTER);

		// this is the explicite wait

		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(W3_LINK_LOCATOR));

		driver.findElement(W3_LINK_LOCATOR).click();

		System.out.println(driver.getWindowHandles());

		for (String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
		}

		driver.findElement(Sql_LINK_LOCATOR).click();

	}

}
