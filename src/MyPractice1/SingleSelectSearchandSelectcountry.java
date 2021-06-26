package MyPractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectSearchandSelectcountry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
       driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
       Thread.sleep(1500);
       driver.findElement(By.className("btn btn-default btn-xs btn-filter")).click();
     Thread.sleep(1500);
       driver.findElement(By.xpath("(//*[@class=\"form-control\"])[2]")).sendKeys("1");
      driver.quit();
	}

}
