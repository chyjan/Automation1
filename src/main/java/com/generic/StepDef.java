package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	
	@Given("open browser")
	public void open_browser() {
	 driver = new ChromeDriver();
	    
	}

	@Given("go to application")
	public void go_to_application() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	}

	@When("put valid user name")
	public void put_valid_user_name() {
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
	   
	}

	@When("put valid password")
	public void put_valid_password() {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	    
	}

	@When("Click login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//https://opensource-demo.orangehrmlive.com/auth/login
	     
	}

	@Then("check login validation- Passed")
	public void check_login_validation_Passed() {
	    
	}

	@When("put invalid username")
	public void put_invalid_username() {
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Jann");
	    
	}

	@When("put invalid password")
	public void put_invalid_password() {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123");
	    
	}




	@When("put null username")
	public void put_null_username() {
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("");

		
	    
	}

	@When("put null password")
	public void put_null_password() { 
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("");
	    
	}

	@Then("check login validation-Failed")
	public void check_login_validation_Failed() {
	    
	}



}
