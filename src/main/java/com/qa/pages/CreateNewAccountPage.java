package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class CreateNewAccountPage extends TestBase{
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement radiobutton;
	@FindBy(id="customer_firstname")
	WebElement fname;
	@FindBy(id="customer_lastname")
    WebElement lname;
	@FindBy(id="passwd")
	WebElement pass;
	@FindBy(id="address1")
	WebElement address;
	
	
	public CreateNewAccountPage() {
		PageFactory.initElements(driver, this);
	}
public  void createnewaccount(String fname, String lname,String pass, String address,String city,String id_state,String zipcode, String phone,String alias) {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,600)", "");
	//js.executeScript("window.scrollBy(500,1000)", "");
	driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
	driver.findElement(By.id("customer_firstname")).sendKeys(fname);
	driver.findElement(By.id("customer_lastname")).sendKeys(lname);
	driver.findElement(By.id("passwd")).sendKeys(pass);
	driver.findElement(By.id("address1")).sendKeys(address);
	js.executeScript("window.scrollBy(500,1000)", "");
	driver.findElement(By.id("city")).sendKeys(city);
	Select select = new Select(driver.findElement(By.name("id_state")));
	select.selectByVisibleText(id_state);
	driver.findElement(By.id("postcode")).sendKeys(zipcode);
	js.executeScript("window.scrollBy(1000,1500)", "");
	driver.findElement(By.id("phone_mobile")).sendKeys(phone);
	driver.findElement(By.id("alias")).sendKeys(alias);
	driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	
	
}
	
}





