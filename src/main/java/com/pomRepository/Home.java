package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericLibrary.WebDriverUtility;

public class Home extends WebDriverUtility{
	WebDriver driver;
public Home(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
private WebElement leadLink;

@FindBy(xpath="//a[text()='Contacts']")
private WebElement contactsLink;

@FindBy(linkText="Organizations")
private WebElement OrganizationsLink;

@FindBy(linkText="Opportunities")
private WebElement OpportunitiesLink;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement adminstratorImg;

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement SignOutLink;


public WebElement getAdminstratiorImg()
{
	return adminstratorImg;
	
}
public WebElement getLeadLink()
{
	return leadLink;
	
}
public WebElement getOrganizationLink()
{
	return OrganizationsLink;
	
}
public WebDriver getDriver()
{
	return driver;
	
}
public WebElement getOppertunitiesLink()
{
	return OpportunitiesLink;
	
}
public WebElement getSignOutLink()
{
	return SignOutLink;
	
}
public WebElement getContactLink()
{
	return contactsLink;
	
}
public void signOut()
{
	mouseOverOnElement(driver, adminstratorImg);
	SignOutLink.click();
}
}
