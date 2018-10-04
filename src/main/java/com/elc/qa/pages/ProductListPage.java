package com.elc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.elc.qa.base.TestBase;

public class ProductListPage extends TestBase {

	
	@FindBy (xpath="//span[contains(text(),'1 result has been found.')]")
	WebElement searchquantityresult;
	@FindBy(xpath="//i[@class='icon-th-list']")
	WebElement listicon;
	@FindBy(xpath="//a[@title='View']//span[contains(text(),'More')]")
	WebElement morebtn;
	@FindBy(xpath="//select[@id='selectProductSort']")
	WebElement sortlist;
	@FindBy (xpath="//span[contains(text(),'Add to cart')]")
	WebElement addtocartbtn;
	
public String verifyProductistPageTitle() {
	return driver.getTitle();
}
public boolean searchQuantityResult() {
	return searchquantityresult.isDisplayed();
	}
public void listIcon() {
	listicon.click();
}
public void moreButtonVerify() {
	morebtn.click();
}
public void sortListverify() {
	Select sc=new Select(sortlist);
	sc.selectByValue("price:asc");
	}
public SuccessfulShoppingPage addToCartBtn() throws IOException {
	addtocartbtn.click();
	return new SuccessfulShoppingPage();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ProductListPage() throws IOException {
		PageFactory.initElements(driver, this);
			}

}
