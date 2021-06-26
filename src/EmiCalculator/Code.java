package EmiCalculator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code {
	public static void main(String []args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://emicalculator.net");
		 WebElement loanamount = driver.findElement(By.id("loanamount"));
		    loanamount.clear();
		    Thread.sleep(1500);
		    loanamount.sendKeys("3000000");
		    WebElement  rate=driver.findElement(By.xpath("//*[@id=\"loaninterest\"]"));
		  //  rate.sendKeys();
		    Robot robot=new Robot();
		    robot.keyPress(KeyEvent.VK_DELETE);
		/*    
		    Thread.sleep(3500);
		   rate.sendKeys("9");
		    WebElement  year=driver.findElement(By.id("//*[@id=\"loaninterest\"]"));
		    
		    year.clear();
		   Thread.sleep(3500);
		   year.sendKeys("25");
		   */
	}

}
