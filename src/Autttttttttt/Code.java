package Autttttttttt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://theresumesearch.com/client/resume/resume-details/37781");
		driver.findElement(By.id("Email")).sendKeys("R041220972942");
		Thread.sleep(1500);
		driver.findElement(By.id("Password")).sendKeys("619990");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
		//Thread.sleep(9500);
		//driver.findElement(By.id("FirstName")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a")).click();
		Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"healthConditionDatatable_paginate\"]/ul/li[4]/a")).click();
	}

}
