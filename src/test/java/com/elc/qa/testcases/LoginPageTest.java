package com.elc.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.elc.qa.base.TestBase;
import com.elc.qa.pages.HomePage;
import com.elc.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
LoginPage loginpage;
HomePage homepage;
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		loginpage=new LoginPage();		
	}
	@Test(priority=1)
	public void verifyTitleTest() {
	String titlepage=loginpage.verifyTitle();
	Assert.assertEquals(titlepage, "My Store");
	}
	@Test(priority=2)
	public void imageDisplayedTest() {
	boolean logo=	loginpage.imageDisplayed();
	Assert.assertTrue(logo);
	}
	@Test(priority=3)
	public void loginPageTest() throws IOException {
		homepage=loginpage.loginPage(pro.getProperty("username"),pro.getProperty("password"));
	}
	
	
	@AfterMethod
public void finish() {
	driver.close();
}
	

}
