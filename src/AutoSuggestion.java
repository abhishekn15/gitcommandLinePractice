import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java");
		 List<WebElement> autosuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		  int count=autosuggestion.size();
		  System.out.println(count);
		  
		  for(WebElement aut:autosuggestion) {
			  String s = aut.getText();
			  System.out.println(s);
		  }
		 // driver.close();
		  autosuggestion.get(2).click();
		  
		  
		  

	}

}





