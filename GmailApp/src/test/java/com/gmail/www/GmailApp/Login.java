package com.gmail.www.GmailApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Login {
	
	@Parameters({"url","userName","passWord"})
	@Test
	public void openApp(String url,String userName,String passWord) throws InterruptedException{
		
		
				
		
		//WebDriver driver;
		ChromeDriverManager.getInstance().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='next']")).click();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		Thread.sleep(3000);
	}

}
