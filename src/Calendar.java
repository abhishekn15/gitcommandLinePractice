import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("DepartDate")).click();
		//Thread.sleep(1200);
		
		Date d=new Date();//Due to method are depricated therefore it give sign 
		int date = d.getDate();
		int month=d.getMonth();
		String s=d.toString();
		//System.out.println(d.toLocaleString());
		//System.out.println(d.toGMTString());
		//System.out.println(d.ge);
		String [] value=s.split(" ");
		System.out.println(value);
		String year=value[5];
		System.out.println(year);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+date+"']")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
