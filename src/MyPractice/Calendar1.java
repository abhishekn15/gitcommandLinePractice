package MyPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		boolean check=false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		// ac.moveToElement(login).click(login);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Tap to add a return date for bigger discounts']")).click();
		
		while (check == false) {
			List<WebElement> monthPick = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));
			for (int i = 0; i < monthPick.size(); i++) {
				if (monthPick.get(i).getText().equals("December 20201")) {
					driver.findElement(By.xpath("//div[.='December 2021']/..//p[.='15']")).click();
					String date = driver.findElement(By.xpath("//p[@data-cy='returnDate']")).getText();
					System.out.println(date);
					check = true;
					break;

				} 
			}
			
			if(check==false) {
				
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

	}
}

