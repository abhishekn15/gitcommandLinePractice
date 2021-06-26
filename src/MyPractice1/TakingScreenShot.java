package MyPractice1;

import java.awt.font.OpenType;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {
 public static void main(String []args) throws InterruptedException, IOException {
	 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("mangera");
		driver.findElement(By.id("loginButton")).click();
		String actualTitle = "actiTIME -  Enter Time-Track";
		Thread.sleep(1500);
		String expectedTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test pass");
		}
		else {
			System.out.println(" Fail");
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des=new File("./Photo/3st.png");
			
			FileUtils.copyFile(src, des);
		}
		driver.close();
 }
	
	
}
