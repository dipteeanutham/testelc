package com.elc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elc.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(id="email")
	@CacheLookup
	WebElement username;
	@FindBy (id="passwd")
	@CacheLookup
	WebElement password;
	@FindBy(xpath="//span//i[contains(@class,'icon-lock left')]")
	@CacheLookup
	WebElement logInBtn;
	@FindBy(xpath="//img[@class=\"logo img-responsive\"]")
	WebElement logoelc;
	@FindBy(xpath="//a[@class=\"login\"]")
	WebElement signinbtn;	
		
	public LoginPage() throws IOException  {
	PageFactory.initElements(driver, this);
		
	}
	public String verifyTitle() {
		return driver.getTitle();
	}
	public boolean imageDisplayed() {
		return logoelc.isDisplayed();
	}
	public HomePage loginPage(String un,String pwd) throws IOException {
		signinbtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		logInBtn.click();
		return new HomePage();
	}
}
