package MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoOfMOuseHover {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.qspiders.com/");
		//WebElement aboutus = driver.findElement(By.partialLinkText("Placements"));
		WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[1]/nav/div[2]/div[2]/a[7]"));
         Actions act=new Actions(driver);
          act.moveToElement(aboutus).build().perform();

	}

}
