import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindow {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
  Set<String> handles = driver.getWindowHandles();
 System.out.println(handles);
 System.out.println(handles.size());
 System.out.println(driver.getTitle());
  for (String browser: handles) {
	  driver.switchTo().window(browser).getWindowHandles();
	 
	  driver.navigate().to("http://www.flipkart.com");
  }
		
	}

}
