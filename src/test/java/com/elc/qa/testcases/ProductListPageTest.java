package com.elc.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.elc.qa.base.TestBase;
import com.elc.qa.pages.HomePage;
import com.elc.qa.pages.LoginPage;
import com.elc.qa.pages.ProductListPage;
import com.elc.qa.pages.SuccessfulShoppingPage;

public class ProductListPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ProductListPage productlistpage;
	SuccessfulShoppingPage successfulshoppingpage;

	public ProductListPageTest() throws IOException {
		super();
		}
@BeforeMethod
	public void setUp() throws IOException, InterruptedException{
	    intialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		productlistpage=new ProductListPage();
		successfulshoppingpage  =new SuccessfulShoppingPage();
		homepage=loginpage.loginPage(pro.getProperty("username"), pro.getProperty("password"));
		homepage.searchTabVerify("Faded Short Sleeve T-shirts");
		Thread.sleep(7000);
		}
@Test(priority=1)
	public void verifyProductListPageTitleTest() {
	String verifyproductlistpagetitle=driver.getTitle();
	Assert.assertEquals(verifyproductlistpagetitle, verifyproductlistpagetitle);
}
@Test(priority=2)
	public void searchQuantityResultTest() throws InterruptedException {
	boolean quantitydisply=productlistpage.searchQuantityResult();
	Thread.sleep(5000);
	Assert.assertTrue(quantitydisply);
	}
@Test (priority=3)
	public void listIconTest() {
	productlistpage.listIcon();
}
@Test(priority=4)
	public void sortListVerify() {
	productlistpage.sortListverify();
	}
@AfterMethod
public void finis() {
	driver.quit();
}
	}
