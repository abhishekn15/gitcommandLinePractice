import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Robot {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rapidtables.com/tools/notepad.html");
		Robot robot=new Robot();
		robot.
	}

	
		
	}


