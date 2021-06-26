import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingWindow1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Realme mobile 7");
		searchbox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Realme 7 (Mist White, 64 GB)']")).click();

		Set<String> handles = driver.getWindowHandles();

		for(String handle:handles) {
			
			driver.switchTo().window(handle);
		}
			WebElement addToCart = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
			addToCart.click();
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _3-J4S1\"]")).click();
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")).click();
		
		driver.close();




	}

}
