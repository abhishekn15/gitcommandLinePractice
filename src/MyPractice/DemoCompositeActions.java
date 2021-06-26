package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoCompositeActions {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	/*driver.get("https://demo.actitime.com/login.do");
	WebElement actLink=driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
	Actions act = new Actions(driver);
	act.sendKeys(Keys.CONTROL).click(actLink).perform();*/
	
	
	driver.get("https://www.facebook.com/");
	WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	
	Actions act = new Actions(driver);
	act.sendKeys(Keys.CONTROL).click(link).perform();
	
	
	//a[text()='Forgotten account?']
	
	
	
     	}

}
