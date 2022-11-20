package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLead {
public CreatingNewLead(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(name="firstname")
private WebElement firstName;

@FindBy(name="lastname")
private WebElement lastName;

@FindBy(name="company")
private WebElement CompanyName;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

@FindBy(name="salutationtype")
private WebElement salutationType;

public void createNewLead
(String firstname,String lastname,String companyname)
{
	firstName.sendKeys(firstname);
	lastName.sendKeys(lastname);
	CompanyName.sendKeys(companyname);
	saveBtn.click();
	
}
public void salutation(WebElement salutation)
{
	this.salutationType=salutation;
}
public WebElement getSalutation()
{
	return salutationType;
	
}
}
