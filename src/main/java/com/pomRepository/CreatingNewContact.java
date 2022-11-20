package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact {
public CreatingNewContact(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(name="firstname")
private WebElement firstName;

@FindBy(name="lastname")
private WebElement lastName;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

public void CreateNewContact(String firstname,String lastname)
{
	firstName.sendKeys(firstname);
	lastName.sendKeys(lastname);
	saveBtn.click();
}
}
