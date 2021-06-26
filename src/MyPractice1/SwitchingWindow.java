package MyPractice1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(driver.getTitle());//it will get title of parent browser
		
		for(String i:s) {
			String t= driver.switchTo().window(i).getTitle();
			System.out.println(t);//it will get title of child browser
		//	if (t.contains("Frames & windows")) { //it will close if get this title
			if (driver.getTitle()=="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!") {
				System.out.println("The test is pass");
				
			}
				//driver.close();
			}
		}
		
		

	}


