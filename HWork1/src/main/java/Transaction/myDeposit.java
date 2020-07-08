package Transaction;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myDeposit {

@Test
	public void deposit() throws InterruptedException{
		
		 System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		 
		
		 
		 driver.findElement(By.id("password")).sendKeys("abc123");

	
		 
		 driver.findElement(By.name("login")).click();

	
		 driver.get("http://www.techfios.com/ibilling/?ng=transactions/deposit/");
		 
		 driver.findElement(By.id("account")).sendKeys("Mean258");
		 driver.findElement(By.id("description")).sendKeys("test");
		 driver.findElement(By.id("amount")).sendKeys("10000");
		 driver.findElement(By.id("submit")).click();



		 

				 
				 
				
		 
	}
}
