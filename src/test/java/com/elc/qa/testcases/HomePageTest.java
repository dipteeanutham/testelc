package com.elc.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.elc.qa.base.TestBase;
import com.elc.qa.pages.HomePage;
import com.elc.qa.pages.LoginPage;
import com.elc.qa.pages.MyWishlistPage;
import com.elc.qa.pages.OrderHistoryPage;
import com.elc.qa.pages.ProductListPage;
import com.elc.qa.pages.ShoppingCartSummary;
import com.elc.qa.pages.WomenPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ProductListPage productlistpage;
	OrderHistoryPage orderhistorypage;
	MyWishlistPage mywishlist;
	WomenPage womenpage;
	ShoppingCartSummary shoppingcartsummary;
	public HomePageTest() throws IOException {
		super();
		}
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		loginpage=new LoginPage();	
		homepage=new HomePage();
	    productlistpage=new ProductListPage();
		orderhistorypage=new OrderHistoryPage();
		mywishlist=new MyWishlistPage();
		womenpage=new WomenPage();
		shoppingcartsummary=new ShoppingCartSummary();
		homepage=loginpage.loginPage(pro.getProperty("username"), pro.getProperty("password"));
		}
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homepagetitle=driver.getTitle();
		Assert.assertEquals(homepagetitle, "My account - My Store");
	}
	@Test(priority=2)
	public void searchTextTest() throws IOException {
	productlistpage=homepage.searchTabVerify("Faded Short Sleeve T-shirts");	
	}
	@Test(priority=3)
	public void orderHistoryTest() throws IOException {
		orderhistorypage=homepage.orderHistory();
	}
	/*@Test(priority=4)
	public void myWishListTest() throws IOException {
		mywishlist=homepage.myWishList();
	}*/
	@Test(priority=5)
	public void shoppingCartSummaryTest() throws IOException {
		shoppingcartsummary=homepage.shoppingCart();
	}
	@Test(priority=6)
	public void womenPageTest() throws IOException {
		womenpage=homepage.womenTab();
	}
	
	@AfterMethod
	public void finish() {
		driver.quit();
	}
	
	
}
