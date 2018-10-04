package com.elc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.elc.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy (id="search_query_top")
	WebElement searchtextfield;
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchbtn;
	@FindBy(xpath="//span[contains(text(),'Order history and details')]")
	WebElement orderhistory;
	@FindBy(xpath="//span[contains(text(),'My wishlists')]")
	WebElement wishlist;
	@FindBy(xpath="//a[contains(@title,'View my shopping cart')]")
	WebElement shoppingcart;
	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li//a[contains(text(),'Women')]")
	WebElement womentab;
public String verifyTitleHomePage() {
		return driver.getTitle();
}
public ProductListPage searchTabVerify(String search) throws IOException {
	searchtextfield.sendKeys(search);
	searchbtn.click();
    return new ProductListPage();	
}
public OrderHistoryPage orderHistory() throws IOException {
	orderhistory.click();
	return new OrderHistoryPage();
}
public MyWishlistPage myWishList() throws IOException {
	wishlist.click();
	return new MyWishlistPage();
}
public ShoppingCartSummary shoppingCart() throws IOException {
	shoppingcart.click();
	return new ShoppingCartSummary();
}
public WomenPage womenTab() throws IOException {
	womentab.click();
	return new WomenPage();
}
	
	
	
	public HomePage() throws IOException {
	
		PageFactory.initElements(driver, this);
		
	}

}
