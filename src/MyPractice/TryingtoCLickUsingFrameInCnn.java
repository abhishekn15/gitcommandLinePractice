package MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryingtoCLickUsingFrameInCnn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.news18.com/");
		//WebElement frame2 = driver.findElement(By.xpath("(//iframe)[2]"));
		WebElement frame3 = driver.findElement(By.xpath("(//iframe)[3]"));
		//driver.switchTo().defaultContent();
		Thread.sleep(2400);
		driver.switchTo().frame(frame3);
		Thread.sleep(3500);
		driver.findElement(By.xpath("/html/body/div[1]/a/amp-img/img")).click();
		Thread.sleep(2500);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul[2]/li[1]/a")).click();
	}

}
