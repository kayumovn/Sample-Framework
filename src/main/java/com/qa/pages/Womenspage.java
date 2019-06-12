package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Womenspage extends TestBase{

	@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div")
	WebElement womenLabel;
	public Womenspage  () {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyWomenLabel() {
		return womenLabel.isDisplayed();
	}
	public void selectTops() {
		driver.findElement(By.id("layered_category_4")).click();
	}

}
