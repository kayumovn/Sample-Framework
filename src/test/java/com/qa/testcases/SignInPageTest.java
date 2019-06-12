package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.MyAccountPage;
import com.qa.pages.SignInPage;

public class SignInPageTest extends TestBase {
HomePage homePage;
SignInPage signInpage;
MyAccountPage myAccountpage;
	public SignInPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		signInpage = homePage.clickSignInButton();
}
	@Test(priority=1)
	public void verifysigninTitleTest() {
		String signTitle = signInpage.verifySignInPageTitle();
		Assert.assertEquals(signTitle, "Login - My Store");
	}
	@Test(priority=2)
	public void verifySignInUrlTest() {
		String signInurl = signInpage.verifySignInPageUrl();
		Assert.assertEquals(signInurl,"http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
		
	@Test(priority=3)
	public void signInTest() {
		myAccountpage=signInpage.signIn(prop.getProperty("email"),prop.getProperty("password"));
		Assert.assertTrue(true, "navigated to my account page");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}