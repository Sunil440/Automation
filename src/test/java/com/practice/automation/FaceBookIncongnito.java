package com.practice.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pomRepository.Facebook;

public class FaceBookIncongnito {
public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver", "/com.automation/chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
			option.addArguments("--incognito");
			WebDriver driver=new ChromeDriver(option);
			driver.get("https://www.facebook.com/");
			Facebook fb=new Facebook(driver);
			fb.LoginToFacebookApp();
			
}
}
