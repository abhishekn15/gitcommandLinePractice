package MyPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingRobotandContexClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	WebElement forgottenacnt = driver.findElement(By.partialLinkText("Forgotten account?"));
		Actions act =new Actions(driver);
		act.contextClick(forgottenacnt).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
