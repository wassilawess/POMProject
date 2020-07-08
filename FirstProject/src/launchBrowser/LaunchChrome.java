package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
 public static void main(String[] args) throws Exception {

	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wassila\\eclipse-workspace\\spring2020Selenium\\FirstProject\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 
	 
	 driver.get("https://www.google.com/");
	 
	 driver.manage().window().maximize();
	 
	 
	 
	// driver.navigate().back();
	 
	 
	 Thread.sleep(2000);
	 
	 
	 driver.close();

	
	

 }
 
}


