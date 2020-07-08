package testLocators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	@Test
	public void	locator() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://objectspy.space/");
		
		driver.findElement(By.id("datepicker")).sendKeys("03/05/1990");
		
		driver.findElement(By.className("input-xlarge")).sendKeys("Afriqua");
		
		WebElement uplodElt = driver.findElement(By.className("input-file"));
		
		
		uplodElt.sendKeys("C:\\testUpload.html");
		
		Thread.sleep(2000);
		
		
	
		
		driver.findElement(By.xpath("//input[@id='photo']")).click();
		
		
		
		
		
		
		
		
		//*[@id="photo"]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.id("submit")).click();
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	
//		
//		driver.findElement(By.ByXPath("[@id="photo"]"));
//		
//		
//		//driver.findElement(By.id("photo")).click();
//		
//		
//	//	driver.get("files.zip");
//		
//
//		//*[@id="photo"]
		
		
		
//		
//		        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
//		        
//		        WebDriver driver = new ChromeDriver();
//
//		        driver.get("http://demo.guru99.com/test/upload/");
//		       
//		        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		        
		        
		      //uploadElement.click();
		        

		        // enter the file path onto the file-selection input field
//		      uploadElement.sendKeys("C:\\newhtml.html");

		        // check the "I accept the terms of service" check box
		       
//		       driver.findElement(By.id("terms")).click();

		        // click the "UploadFile" button
		     
		        driver.findElement(By.name("send")).click();
		        
		
		
		
	}

}
