package com.elc.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.elc.qa.base.TestBase;
import com.elc.qa.pages.LoginPage;
import com.elc.qa.pages.SignupPage;

public class SignupPageTest extends TestBase {
	LoginPage loginpage;
	SignupPage signuppage;
	public SignupPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@BeforeMethod
public void setUp() throws IOException {
	intialization();
	loginpage=new LoginPage();
	signuppage=new SignupPage();
}
@Test
public void SignUpBtnTest() throws IOException {
	loginpage=signuppage.SignUpPage();
}
@AfterMethod
public void finish() {
	driver.quit();
}
	
	
	

}
