package uploadPicture;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Uploading2nd {
	public static void main() {
	
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://smallpdf.com/share-document");
		WebElement file = driver.findElement(By.cssSelector(".sc-1rkezdt-6"));
		try {
			Thread.sleep(1500);
			file.sendKeys("G:\\Java Eclipse2\\MyPractice\\debug.log");
		} catch (InterruptedException e) {
			driver.close();
			
		}
		
	}	//driver.findElement(By.id("terms")).click();
	//	driver.findElement(By.id("submitbutton")).click();

}
