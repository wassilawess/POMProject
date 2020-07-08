package session5;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newDepositTest {

	WebDriver driver;

	@BeforeMethod
	public void lunchbrowser() {

		// setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		// creating web driver instance
		driver = new ChromeDriver();

		// maximizing browser
		// driver.manage().window().maximize();

		// get to the site
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Test
	public void userShouldBeAbleToAddDeposite() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

		String expectedTitle = "Dashboard- iBilling";
		Thread.sleep(1000);

		// Assert.assertEquals(driver.getTitle(), expectedTitle, "Dashboard Page did not
		// display!");

		By TRANSACTION_MENU_LOCATOR = By.xpath("//ul[@id='side-menu']/descendant::span[text()='Transactions']");
		// By TRANSACTION_MENU_LOCATOR = By.xpath("
		// //span[contains(text(),'Transactions')]");
		Thread.sleep(2000);

		// By NEW_DEPOSIT_PAGE_LOCATOR = By.linkText("New Deposit");

		By NEW_DEPOSIT_PAGE_LOCATOR = By.xpath("//a[contains(text(),'New Deposit')]");

		driver.findElement(TRANSACTION_MENU_LOCATOR).click();

		waitForElement(NEW_DEPOSIT_PAGE_LOCATOR, driver, 30);

		// Thread.sleep(1000);

		driver.findElement(NEW_DEPOSIT_PAGE_LOCATOR).click();

		Select select = new Select(driver.findElement(By.cssSelector("select#account")));

		select.selectByVisibleText("Mean258");
		Thread.sleep(5000);

		Random rnd = new Random();
		rnd.nextInt(999);

		String expectrdDescription = "MYTest" + new Random().nextInt(999);


		driver.findElement(By.id("description")).sendKeys(expectrdDescription);
		driver.findElement(By.id("amount")).sendKeys("100,000");
		driver.findElement(By.id("submit")).click();

		System.out.println("my expected description is:"+expectrdDescription);
		
		//new WebDriverWait(driver,60).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath()));

		//waitForElement(NEW_DEPOSIT_PAGE_LOCATOR, driver, 60);
		waitForElement(By.linkText(expectrdDescription),driver,60);
		
		List<WebElement> descriptionElements = driver.findElements(By.xpath("//table/descendant::a"));
		
		JavascriptExecutor js	= (JavascriptExecutor)driver;
		//for scroll down
		js.executeScript("scroll(0,400)");
		
		Thread.sleep(2000);
		
		//for scroll up
		
		js.executeScript("scroll(0,-600)");
		Assert.assertTrue(isDescriptionMatch(expectrdDescription, descriptionElements),"deposit unsucessful!" );
		Thread.sleep(5000);
	}
	private boolean isDescriptionMatch(String expectedDescription, List<WebElement> descptionElements) {
		for(int i=0; i<descptionElements.size();i++)
		{
			if(expectedDescription.equalsIgnoreCase(descptionElements.get(i).getText())) {
				return true;

			}
		}
		return false;
		
	}
	private void waitForElement(By locator, WebDriver driver1, int time) {

		new WebDriverWait(driver1, time).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

	@AfterMethod
	public void closeEverything() {
		

		driver.close();
		driver.quit();

	}

}