package com.elc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elc.qa.base.TestBase;

public class SignupPage extends TestBase {

	@FindBy (xpath="//a[contains(text(),'Sign in')]")
	WebElement signinbtn;
	
	public LoginPage SignUpPage() throws IOException {
		signinbtn.click();
		return new LoginPage();
	}
		public SignupPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

}
