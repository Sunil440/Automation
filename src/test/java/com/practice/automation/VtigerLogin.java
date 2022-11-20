package com.practice.automation;

import org.apache.poi.ss.formula.functions.LogicalFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.genericLibrary.BaseClass;
import com.genericLibrary.ExcelUtility;
import com.genericLibrary.FileUtility;
import com.genericLibrary.WebDriverUtility;
import com.pomRepository.CreatingNewLead;
import com.pomRepository.Home;
import com.pomRepository.Leads;
import com.pomRepository.Login;

public class VtigerLogin extends BaseClass {
public static void main(String[] args) throws Throwable {
	FileUtility fu=new FileUtility();
	ExcelUtility eu=new ExcelUtility();
	WebDriverUtility wu=new WebDriverUtility();
	
	String url=fu.getPropertyKeyValue("url");
	String username=fu.getPropertyKeyValue("username");
	String password=fu.getPropertyKeyValue("password");
	String browser=fu.getPropertyKeyValue("browser");
	
	String firstname=eu.getDataFromExcel("Sheet2", 1, 0);
	String lastname=eu.getDataFromExcel("Sheet2", 1, 1);
	String companyname=eu.getDataFromExcel("Sheet2", 1, 2);
	
	
	 
	WebDriver driver=null;
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		driver=new EdgeDriver();
	}
	driver.get(url);
    Login lo=new Login(driver);
    lo.LogInToApp(username, password);
    Home h=new Home(driver);
    h.getLeadLink().click();
    Leads l=new Leads(driver);
    l.LeadLink();
    
   
    /*
    WebElement w=driver.findElement(By.name("salutationtype"));
    Select sel=new Select(w);
    sel.selectByValue("Mr.");
    */
    CreatingNewLead cn=new CreatingNewLead(driver);
    wu.select(cn.getSalutation(),"Mr.");
    cn.createNewLead(firstname, lastname, companyname);
    h.signOut();
    
    //cn.
   // h.signOut();
    //System.out.println("login");
    //driver.close();
    //Actions act =new Actions(driver);
    		//act.moveToElement(driver.findElement
    			//	(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
    		
	//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
}
}
