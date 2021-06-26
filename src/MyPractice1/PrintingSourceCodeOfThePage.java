package MyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingSourceCodeOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("The current url is"+driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println("The title is"+driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getClass());
		driver.quit();
		
	}

}
