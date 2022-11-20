package com.genericLibrary;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

public class WebDriverUtility {
public void mouseOverOnElement(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
		
}
public void select(WebElement element,String value)
{
	Select sel =new Select(element);
			sel.selectByValue(value);
}
}
