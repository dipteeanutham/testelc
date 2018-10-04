package com.elc.qa.pages;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elc.qa.base.TestBase;

public class AddtocartPage extends TestBase {
	HomePage homepage=new HomePage();
@FindBy (xpath="//a[contains(text(),'Faded Short Sleeve T-shirts')]")
WebElement mousehover;
@FindBy(xpath="//a[@data-id-product='1']//span")
WebElement addtocartbtn;
@FindBy(xpath="//a[@title=\"View my shopping cart\"]")
WebElement viewaddtocart;

public void mouseOverOnProductPage() throws IOException, InterruptedException{
	homepage.womenTab();
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.moveToElement(mousehover).moveToElement(addtocartbtn).click().build().perform();
	
}
public ShoppingCartSummary viewAddToCartPage() throws IOException {
	viewaddtocart.click();
	return new ShoppingCartSummary();
}
	
		public AddtocartPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

}
