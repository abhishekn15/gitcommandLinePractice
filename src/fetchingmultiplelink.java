import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchingmultiplelink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("http://www.amazon.com");
		driver.get("https://www.youtube.com/watch?v=SxgL2L1cZRI");
		driver.manage().window().maximize();
		
			List<WebElement> link = driver.findElements(By.ByXPath.xpath("//a"));
			int count = link.size();
			System.out.println(count);
			
	
	for (int i=0;i<link.size();i++) {
		System.out.println(link.get(i).getText());
				
			}
	driver.quit();
		}
         
	}


