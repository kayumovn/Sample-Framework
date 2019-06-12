package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DressPage;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;
import com.qa.pages.TshirtPage;
import com.qa.pages.Womenspage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	SignInPage signInpage;
	Womenspage womenPage;
	DressPage dressPage;
	TshirtPage tshirtPage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		signInpage = new SignInPage();
		womenPage = new Womenspage();
		dressPage = new DressPage();
		tshirtPage = new TshirtPage();
	}
	@Test(priority=1)
	public void homePageTitleTest() {
		String title = homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "My Store");
	}
	
	@Test(priority=2)
	public void homePageLogoTest() {
		boolean flag = homePage.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void clickSignInButtonTest() {
		signInpage = homePage.clickSignInButton();
	}
	@Test(priority=4)
	public void clickWomenMenuTest() {
		womenPage=homePage.clickWomenMenu();
		Assert.assertTrue(true);
	}
	@Test(priority=5)
	public void clickDressMenuTest() {
		dressPage = homePage.clickDressMenu();
		Assert.assertTrue(true);
	}
	@Test(priority=6)
	public void clickTshirtMenuTest() {
		tshirtPage = homePage.clickTshirtMenu();
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
