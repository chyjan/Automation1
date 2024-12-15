package com.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPageFactory {
	// Java encapsulation = Done
	// Selenium ==> PF = @Findby(xpath=" ")
	// POM = By
	
	@FindBy(xpath ="//*[@name='username']")
	private WebElement user;
	
	@FindBy(xpath ="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement loginBtn;
	
	
	public WebElement getUser() { // Method = Y, void = N, return = Y, static = N, AM = public
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
	
}
