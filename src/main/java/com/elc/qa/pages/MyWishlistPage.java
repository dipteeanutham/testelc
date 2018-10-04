package com.elc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elc.qa.base.TestBase;

public class MyWishlistPage extends TestBase {

	@FindBy (xpath="//input[@id='name']")
	WebElement entertext;
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement savebtn;
	@FindBy (xpath="//i[@class='icon-remove']")
	WebElement removebtn;
public void enterText(String mywish) {
	entertext.sendKeys(mywish);
	savebtn.click();
}
public void clickOnRemoveBtn() {
	removebtn.click();
}
public MyWishlistPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

}
