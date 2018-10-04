package com.elc.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.elc.qa.base.TestBase;
import com.elc.qa.pages.HomePage;
import com.elc.qa.pages.LoginPage;
import com.elc.qa.pages.ProductListPage;
import com.elc.qa.pages.WomenPage;

public class WomenPageTest extends TestBase {
	HomePage homePage;
	LoginPage loginpage;
	ProductListPage productlistpage;
	WomenPage womenpage;
	public WomenPageTest() throws IOException {
		super();
		}
@BeforeMethod
public void setUp() throws IOException, InterruptedException {
	intialization();
	 homePage=new HomePage();
	 loginpage=new LoginPage();
	 productlistpage=new ProductListPage();
	 womenpage=new WomenPage();
	 homePage=loginpage.loginPage(pro.getProperty("username"),pro.getProperty("password"));
	 homePage.womenTab();
	 Thread.sleep(5000);
}
@Test(priority=1)
public void topLinkVerifyTest() throws IOException, InterruptedException {
productlistpage=womenpage.topsLinkVeriy();
}
@Test(priority=2)
public void priceRangeMouseHoverTest() throws IOException, InterruptedException {
	productlistpage=womenpage.topsLinkVeriy();
	womenpage.priceRangeMouseHover();
}
@Test(priority=3)
public void cottonCheckBoxTest() throws IOException, InterruptedException {
	productlistpage=womenpage.topsLinkVeriy();
	womenpage.cottonCheckBox();
}
@Test(priority=4)
public void casualChechBoxTest() throws IOException, InterruptedException {
	productlistpage=womenpage.topsLinkVeriy();
	womenpage.casualCheckBox();
}

@AfterMethod
public void finish() {
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
