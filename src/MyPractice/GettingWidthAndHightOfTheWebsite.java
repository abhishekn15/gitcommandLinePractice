package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingWidthAndHightOfTheWebsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class=\"_2AkmmA _29YdH8\"]")).click();;
		
		// System.out.println(sd.getText());
		 WebElement searchbox = driver.findElement(By.className("LM6RPg"));
		System.out.println(searchbox.getSize().getHeight());
		System.out.println(searchbox.getSize().getWidth());
		
		driver.close();
	}

}
