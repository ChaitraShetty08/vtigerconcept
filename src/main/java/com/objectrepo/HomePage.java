package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script.WebDriver_Utilities;

public class HomePage 
{
	WebDriver driver;
	WebDriver_Utilities wdu=new WebDriver_Utilities();
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//td[.='Organizations']")
private WebElement orglink;

public WebElement getOrglink() {
	return orglink;
}


@FindBy(xpath="//a[.='Contacts']")
private WebElement contactlink;



public WebElement getContactlink() {
	return contactlink;
}

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement signoutlogo;

public WebElement getSignoutlogo() 
{
	return signoutlogo;
}

@FindBy(xpath="//a[.='Sign Out']")
private WebElement signout;

public  WebElement getSignout() 
{
	return signout;
	
}

@FindBy(xpath="//a[.='More']")
private WebElement moredropdown;

public WebElement getMoredropdown() {
	return moredropdown;
}

@FindBy(xpath="//a[@name='Sales Order']")
private WebElement salesorderlink;


public WebElement getSalesorderlink() {
	return salesorderlink;
}


public void impElements()
{
		getOrglink().click();
		getContactlink().click();
}		
		
public void	signOutInHomePage(WebDriver driver)
{
		signoutlogo.click();
		
	
	wdu.moveToElement(driver, signoutlogo);
	
	getSignout().click();
	
}

public void moreLinkInHomePage(WebDriver driver)
{
	getMoredropdown().click();
	wdu.moveToElement(driver, moredropdown);
	salesorderlink.click();
}
}
