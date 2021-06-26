package MyPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TryingDiffrentToNewFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
          driver.get("https://www.selenium.dev/downloads/");
          
     //   int yaxis = driver.findElement(By.xpath("//h2[text()='Selenium Client & WebDriver Language Bindings']")).getLocation().getY();
     //      JavascriptExecutor jxe=(JavascriptExecutor)driver;
     //      jxe.executeScript("window.scrollTo(0,"+yaxis+")");   
           
           driver.findElement(By.xpath("(//a[text()='API Docs'])[2]")).click();
           
           WebElement allClassFrame = driver.findElement(By.xpath("//frame[2]"));
           WebElement overViewPcFrame = driver.findElement(By.xpath("(//frame[1])[2]"));
           WebElement allPackageFrame = driver.findElement(By.xpath("(//frame[1])[1]"));
           
           driver.switchTo().frame(allClassFrame);
           driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
           driver.switchTo().defaultContent();
           WebDriverWait wait=new WebDriverWait(driver,20);
           Thread.sleep(2000);
           driver.switchTo().frame(overViewPcFrame);
           Thread.sleep(3000);
           String text=driver.findElement(By.xpath("/html/body/div[4]/div[2]/ul/li/ul[1]/li/table/tbody/tr[2]/td/code/span/a")).getText();
           System.out.println(text);
           driver.switchTo().defaultContent();
           driver.switchTo().frame(allPackageFrame);
           Thread.sleep(3500);
           
           WebElement  con = driver.findElement(By.xpath("//a[contains(text(),'condition')]"));
           con.click();
          System.out.println(con.getText());
           
           
           
           
           
           
           
           
           
           
           
           
           }

}
