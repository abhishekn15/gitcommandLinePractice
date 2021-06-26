package MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerGoingToPricing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.vtiger.com");
/**
 * We can move to Training service without using Actions Class
 */
WebElement resources = driver.findElement(By.xpath("(//*[@id=\"navbarDocumentation\"])[2]"));

Actions act =new Actions(driver);
act.moveToElement(resources).perform();
driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[3]/div/a[4]/div/h6")).click();
driver.quit();
	}

}
