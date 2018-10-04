package com.elc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elc.qa.base.TestBase;

public class WomenPage extends TestBase{

	@FindBy(xpath="//div[@id='left_column']//div[@id='categories_block_left']//div[@class='block_content']//ul[@class='tree dynamized']//li//span[@class='grower CLOSE']//following-sibling::a[contains(text(),'Tops')]")
	WebElement tops;
	@FindBy(xpath="//a[@style='left: 0%;']")
	WebElement pricerange;
	@FindBy(xpath="//input[@id='layered_id_feature_5']")
	WebElement cotton;
	@FindBy (xpath="//input[@id='layered_id_feature_11']")
	WebElement casual;
	
	public ProductListPage topsLinkVeriy() throws IOException, InterruptedException {
		tops.click();
		Thread.sleep(5000);
		return new ProductListPage();
	}
	public void priceRangeMouseHover() {
		Actions action=new Actions(driver);
		action.moveByOffset(50, 0).release().build().perform();
		}
	public void cottonCheckBox() {
		cotton.click();
	}
	public void casualCheckBox() {
		casual.click();
	}
	public WomenPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

}
