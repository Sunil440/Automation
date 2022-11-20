package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
public Facebook(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement emailB;

@FindBy(id="pass")
private WebElement passwordP;

@FindBy(name="login")
private WebElement login;

public void LoginToFacebookApp()
{
	emailB.sendKeys("liku.sunil@gmail.com");
	passwordP.sendKeys("liku@440");
	login.click();
}
}
