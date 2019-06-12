package com.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CreateNewAccountPage;
import com.qa.pages.HomePage;
import com.qa.pages.MyAccountPage;
import com.qa.pages.SignInPage;
import com.qa.util.TestUtil;

public class CreateNewAccountPageTest extends TestBase{

	HomePage homePage;
	SignInPage signInpage;
	CreateNewAccountPage crnewaccpage;
	TestUtil testutil;
	String sheetName="newAccount";
	
		public CreateNewAccountPageTest() {
			super();
		}
		@BeforeMethod
		public void setUp() {
			initialization();
			homePage = new HomePage();
			signInpage = homePage.clickSignInButton();
			
	}
	@DataProvider
		public Object[][] getHybridTestData() {
		Object [][]data=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(dataProvider="getHybridTestData")
	public void createnewAccount(String Fname,String Lname,String Password,String Address,String City,String State,String Zipcode,String Phone,String Alias) throws Throwable {
		homePage.clickSignInButton();
		signInpage.createNewAccount();
		//crnewaccpage.createnewaccount("Nuriddin","Kayumov","nurik","Belmont Ave","Chicago","Illinois","60625","3123214566","Washington st");
	crnewaccpage.createnewaccount(Fname, Lname, Password, Address, City, State, Password, Phone, Alias);
	}
		

@AfterMethod
public void tearDown() {
	//driver.quit();
}
}
