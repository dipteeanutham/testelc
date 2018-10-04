package com.elc.qa.testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.elc.qa.base.TestBase;
import com.elc.qa.pages.HomePage;
import com.elc.qa.pages.LoginPage;
import com.elc.qa.pages.MyWishlistPage;
import com.elc.qa.util.Testutil;

public class MyWishlistPageTest extends TestBase {
LoginPage loginpage;
HomePage homepage;
MyWishlistPage mywishlist;
Testutil testUtil;
	public MyWishlistPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
@BeforeMethod
public void setUp() throws IOException {
	intialization();
	 loginpage=new LoginPage();
	 homepage=new HomePage();
	 mywishlist=new MyWishlistPage();
	 testUtil=new Testutil();
	 homepage=loginpage.loginPage(pro.getProperty("username"), pro.getProperty("password"));
}
@DataProvider
public Object[][] getElcestData(){
	Object data[][] = Testutil.getTestData("wishname");
				return data;
}

@Test(priority=1,dataProvider="getElcestData")
public void enterTextinNameFieldTest(String mywish) throws IOException {
	homepage.myWishList();
	mywishlist.enterText(mywish);
}
/*@Test(priority=2)
public void clickOnRemoveBtnTest() throws IOException, InterruptedException {
	homepage.myWishList();
	mywishlist.clickOnRemoveBtn();
	Thread.sleep(2000);
 Alert alt=driver.switchTo().alert();
 alt.accept();
}*/
		

	
	@AfterMethod
public void finish() {
	driver.close();
}

}
