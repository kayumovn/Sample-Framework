package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SignInPage extends TestBase {

	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passwd;
	
	@FindBy(xpath="//p[@class='submit']//span[1]")
	WebElement loginBt;
	
	@FindBy(id="email_create")
	WebElement createAccount;
	
	@FindBy(name="SubmitCreate")
	WebElement createAcBt;
	
		
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
public String verifySignInPageTitle() {
	return driver.getTitle();
}
public String verifySignInPageUrl() {
	return driver.getCurrentUrl();
}
public MyAccountPage signIn(String us, String pwsd) {
	email.sendKeys(us);
	passwd.sendKeys(pwsd);
	loginBt.click();
	return new MyAccountPage();
	
}
public CreateNewAccountPage createNewAccount() {
	createAccount.sendKeys("imran@mail.com");
	createAcBt.click();
return new CreateNewAccountPage();

}
}
