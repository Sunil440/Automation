package com.practice.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericLibrary.ExcelUtility;
import com.genericLibrary.FileUtility;
import com.genericLibrary.WebDriverUtility;
import com.pomRepository.Contact;
import com.pomRepository.CreatingNewContact;
import com.pomRepository.Home;
import com.pomRepository.Login;

public class VtigerContacts {
public static void main(String[] args) throws Throwable {
	FileUtility fu=new FileUtility();
	WebDriverUtility wu=new WebDriverUtility();
	ExcelUtility eu=new ExcelUtility();
	
	
	
	String url=fu.getPropertyKeyValue("url");
	String username=fu.getPropertyKeyValue("username");
	String password=fu.getPropertyKeyValue("password");
	String firstname=eu.getDataFromExcel("Sheet2", 4, 0);
	String lastname=eu.getDataFromExcel("Sheet2", 4, 1);
	
	
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	Login lo=new Login(driver);
	lo.LogInToApp(username, password);
	Home ho=new Home(driver);
	ho.getContactLink().click();
	Contact co=new Contact(driver);
	co.ContactLink();
	CreatingNewContact cnc=new CreatingNewContact(driver);
	cnc.CreateNewContact(firstname, lastname);
}
}
