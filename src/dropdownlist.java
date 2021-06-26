import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			WebElement sel = driver.findElement(By.id("select-demo"));
			Select select=new Select(sel);
			select.selectByIndex(2);
			//System.out.println("select.selectByInde")
			

	}

}
