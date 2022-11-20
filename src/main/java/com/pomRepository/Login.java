package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
public Login(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="user_name")

	private WebElement usernameEdt;
@FindBy(name="user_password")
private WebElement passwordEdt;
@FindBy(id="submitButton")
private WebElement loginBtn;
public WebElement getUsername()
{
	return usernameEdt;
	
}
public WebElement getPassword()
{
	return passwordEdt;
	
}
public WebElement getLoginBtn()
{
	return loginBtn;
	
}
public void LogInToApp(String username,String password)
{
	usernameEdt.sendKeys(username);
	passwordEdt.sendKeys(password);
	loginBtn.click();
}
}

