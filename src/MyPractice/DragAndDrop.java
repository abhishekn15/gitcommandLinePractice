package MyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		WebElement source = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
		Actions act =new Actions(driver);
		
		
			act.dragAndDrop(source, target).perform();
		

	}

}
