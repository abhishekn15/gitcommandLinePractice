package uploadPicture;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadingFileBYSendKeys {
	@Test
	public void upload() {
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement file = driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("G:\\Java Eclipse2\\MyPractice\\debug.log");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		//  WebElement expectedMessage = driver.findElement(By.xpath("//*[@id=\"res\"]/center"));
		//String actual = null;
		
		//driver.close();
		
	}
	

}
