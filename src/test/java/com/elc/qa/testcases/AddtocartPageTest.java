package com.elc.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.elc.qa.base.TestBase;
import com.elc.qa.pages.AddtocartPage;
import com.elc.qa.pages.HomePage;
import com.elc.qa.pages.LoginPage;
import com.elc.qa.pages.ShoppingCartSummary;

public class AddtocartPageTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	ShoppingCartSummary shoppingcartsummary;
	AddtocartPage addtocartpage;

@BeforeMethod
public void setUp() throws IOException, InterruptedException {
	intialization();
	homepage=new HomePage();
	loginpage=new LoginPage();
	shoppingcartsummary=new ShoppingCartSummary();
	addtocartpage=new AddtocartPage();
	loginpage.loginPage(pro.getProperty("username"), pro.getProperty("password"));
	Thread.sleep(5000);
	}
@Test(priority=1)
public void mouseHoverOnProductTest() throws IOException, InterruptedException {
	addtocartpage.mouseOverOnProductPage();
}
@Test(priority=2)
public void viewAddToCartPageTest() throws IOException {
	shoppingcartsummary=addtocartpage.viewAddToCartPage();
}



	
@AfterMethod
public void finish(){
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public AddtocartPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

}
