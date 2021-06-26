package MyPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractisingSwitchto {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println(tabs.size());
		System.out.println(driver.getTitle());
		for (String tab:tabs) {
			driver.switchTo().window(tab);
			String s = driver.getTitle();
			
			if (s.equals("actiTIME - Time Tracking Software for Boosting Your Business"));{
				Thread.sleep(3500);
				driver.findElement(By.xpath("//a[text()='Help Center']")).click();
				
				//driver.findElement(By.xpath("(//*[@class=\"main-menu__link\"])[6]")).click();
			}
			
			
		}
           driver.quit();
	}

}
