import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopulationCalculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
String xpath="//div[@class='col-sm-6 col-counters']";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver, 10);
		driver.get("https://www.worldometers.info/world-population/#:~:text=The%20current%20world%20population%20is,currently%20living)%20of%20the%20world.");
		driver.findElement(By.cssSelector("div[class='maincounter-number']"));
	
		List<WebElement> totalPopulation = driver.findElements(By.xpath(xpath));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(totalPopulation));
		for(WebElement p:totalPopulation) {
			System.out.println(p.getText());
		}
		
		//driver.findElement("");
driver.quit();
	}

}
