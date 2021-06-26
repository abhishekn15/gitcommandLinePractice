package MyPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CalenderCustomize {

	/*
	 * @FindBy(xpath = "//span[.='DEPARTURE']'") WebElement depature;
	 */

	public static void main(String[] args) throws InterruptedException {
		boolean check = false;
		String monthYear="September 2020";
		String dateSelect="21";
		String depurture="This is to check then";
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		// ac.moveToElement(login).click(login);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		driver.findElement(By.xpath("//span[.='+depurture+']"));//refer this for writing the dynamic xpaht
		;
		// ac.moveToElement(dept).click(dept);
		// driver.findElement(By.xpath("(//p[.='28'])[2]")).click();

		while (check == false) {
			List<WebElement> monthPick = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));
			for (int i = 0; i < monthPick.size(); i++) {
				if (monthPick.get(i).getText().equals(monthYear)) {
					driver.findElement(By.xpath("//div[.='"+monthYear+"']/..//p[.='"+dateSelect+"']")).click();
					String date = driver.findElement(By.xpath("//p[@data-cy='departureDate']")).getText();
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
