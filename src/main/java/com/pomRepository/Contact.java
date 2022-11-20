package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
public  Contact(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement Contact;
public WebElement getContact()
{
	return Contact;
	
}
public void ContactLink()
{
	Contact.click();
}
}
