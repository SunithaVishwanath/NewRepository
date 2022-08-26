package com.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	@Test
	public void Login() {
		WebDriver driver = null;
		
		String BROWSER = System.getProperty("Browser");
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}else
		{
			System.out.println("Enter proper browser name");
			
		}
		
		driver.quit();
		
		
		
	}

}
