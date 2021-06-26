package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exp1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try {
		  WebElement checkbox = driver.findElement(By.name("selected(1234)"));
		  checkbox.click();
		  wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		  System.out.println(checkbox.isSelected());
		}catch(Exception e) {
		System.out.println(e);
driver.close();
	}
		WebElement select=driver.findElement(By.id("selecttype"));
		Select sel=new Select(select);
		sel.selectByIndex(0);
		boolean options = sel.isMultiple();
		System.out.println(options);
		wait.until(ExpectedConditions.elementToBeSelected(select));
		wait.until(ExpectedConditions.visibilityOf(select));

	driver.quit();	
}}
