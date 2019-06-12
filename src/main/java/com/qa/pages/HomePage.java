package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement women;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dresses;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement tshirt;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signBt;
	
	@FindBy(xpath="//*[@id=\"header_logo\"]/a/img")
	WebElement myLogo;

public HomePage() {
	PageFactory.initElements(driver, this);
}
public String verifyHomePageTitle() {
	return driver.getTitle();
}
public boolean validateLogo() {
	return myLogo.isDisplayed();
}
public SignInPage clickSignInButton() {
	signBt.click();
	return  new SignInPage();
}
public Womenspage clickWomenMenu() {
	women.click();
	return new Womenspage();
}
public DressPage clickDressMenu() {
	dresses.click();
	return new DressPage();
}
public TshirtPage clickTshirtMenu() {
	tshirt.click();
	return new TshirtPage();
}
}