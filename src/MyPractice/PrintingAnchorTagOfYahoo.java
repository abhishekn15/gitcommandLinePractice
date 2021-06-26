package MyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAnchorTagOfYahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
           int count = links.size();
           System.out.println(count);
           
          for(WebElement link:links) {
        	  System.out.println(link.getText());
          
           }
           driver.close();
	}

}
