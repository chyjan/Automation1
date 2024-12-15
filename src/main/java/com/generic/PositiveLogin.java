package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveLogin {
	
	public void getLogin() { // static = no,
		// actual code
		
		//actual login code //open browser =chrome 
		WebDriver driver = new ChromeDriver(); 
		//go to application URL 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		//put user name 
		driver.findElement(By.xpath("user location")).sendKeys("actual user");
		//put password
		driver.findElement(By.xpath("password location")).sendKeys("actual password"); 
		//click login button 
		driver.findElement(By.xpath("login button location")).click();

	}
	}