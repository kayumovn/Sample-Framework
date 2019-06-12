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

public class WomenPageTest extends TestBase {

	HomePage homePage;
	Womenspage womenPage;
	
	public WomenPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		womenPage = new Womenspage();
		womenPage = homePage.clickWomenMenu();
		}

	@Test(priority=1)
	public void verifyWomenlabe() {
		Assert.assertTrue(womenPage.verifyWomenLabel(), "womens label is missing");
	}
	@Test(priority=2)
	public void selectTopscheckbox() {
		womenPage.selectTops();
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
