package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, Loginpage.this);
	}

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;

	public WebElement getUsername() 
	{
		return username;
	}

	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;

	public WebElement getPassword() 
	{
		return password;
	}

	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void loginApp()
	{
		getUsername().sendKeys("admin");
		getPassword().sendKeys("admin");
		getLoginbtn().clear();
	}
	public void loginAppElements(String username, String password)
	{
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginbtn().click();

	}
}

