package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads {
public Leads(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement LeadLink;
public WebElement getLeadlink()
{
	return LeadLink;
	
}
public void LeadLink()
{
	LeadLink.click();
}
}
