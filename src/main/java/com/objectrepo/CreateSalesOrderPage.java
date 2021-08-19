package com.objectrepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script.WebDriver_Utilities;

public class CreateSalesOrderPage 
{

public CreateSalesOrderPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//img[@title='Create Sales Order...']")
private WebElement createsalesbtn;


public WebElement getCreatesalesbtn() {
	return createsalesbtn;
}

@FindBy(xpath="//input[@name='subject']")
private WebElement subjecttxtfld;

public WebElement getSubjecttxtfld() 
{
	return subjecttxtfld;
}

@FindBy(xpath="(//img[@title='Select'])[4]")
private WebElement orgimgbtn;

public WebElement getOrgimgbtn() {
	return orgimgbtn;
}

@FindBy(xpath="//a[.='Samsung']")
private WebElement orgname;


public WebElement getOrgname() {
	return orgname;
}

@FindBy(xpath="//textarea[@name='bill_street']")
private WebElement billingaddtxtareafld;

public WebElement getBillingaddtxtareafld() {
	return billingaddtxtareafld;
}

@FindBy(xpath="//textarea[@name='ship_street']")
private WebElement shippingaddtxtareafld;


@FindBy(xpath="//select[@name='sostatus']")
private WebElement statusdropdown;



public WebElement getShippingaddtxtareafld() {
	return shippingaddtxtareafld;
}

public WebElement getStatusdropdown() {
	return statusdropdown;
}

@FindBy(xpath="//input[@value='U']")
private WebElement assignedtouserradiobtn;

@FindBy(xpath="//select[@name='carrier']")
private WebElement carrierdropdown;

public WebElement getCarrierdropdown() {
	return carrierdropdown;
}

@FindBy(xpath="//select[@name='invoicestatus']")
private WebElement invoicestatusdropdown;


public WebElement getAssignedtouserradiobtn() {
	return assignedtouserradiobtn;
}

@FindBy(xpath="//input[@value='T']")
private WebElement assignedtogroupradiobtn;

public WebElement getAssignedtogroupradiobtn() {
	return assignedtogroupradiobtn;
}

@FindBy(xpath="//select[@name='assigned_user_id']")
private WebElement assignedtouserdropdown;

@FindBy(xpath="//select[@name='assigned_group_id']")
private WebElement assignedtogroupdropdown;


public WebElement getAssignedtouserdropdown() {
	return assignedtouserdropdown;
}

public WebElement getAssignedtogroupdropdown() {
	return assignedtogroupdropdown;
}

public WebElement getInvoicestatusdropdown() {
	return invoicestatusdropdown;
}

@FindBy(xpath="//img[@id='searchIcon1']")
private WebElement itemnamelookupimg;


public WebElement getItemnamelookupimg() {
	return itemnamelookupimg;
}

@FindBy(xpath="//a[.='Lipstick']")
private WebElement productnamelink;


public WebElement getProductnamelink() {
	return productnamelink;
}

@FindBy(xpath="//input[@name='qty1']")
private WebElement qtytxtfld;


public WebElement getQtytxtfld() {
	return qtytxtfld;
}

@FindBy(xpath="(//input[@type='submit'])[1]")
private WebElement savebtn;



public WebElement getSavebtn() {
	return savebtn;
}

@FindBy(xpath="//input[@name='search_text']")
private WebElement searchordnametxtfld;

@FindBy(xpath="//input[@name='search']")
private WebElement searchnowbtn;


public WebElement getSearchordnametxtfld() {
	return searchordnametxtfld;
}

public WebElement getSearchnowbtn() {
	return searchnowbtn;
}


public void tc10(WebDriver driver) throws InterruptedException
{
	
	createsalesbtn.click();
	
	
	orgimgbtn.click();
	
	WebDriver_Utilities wb=new WebDriver_Utilities();
	wb.switchwindow(driver, "Accounts&action");
	
	getSearchordnametxtfld().sendKeys("Samsung");
	getSearchnowbtn().click();
	orgname.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	wb.switchwindow(driver, "Sales");
	
	getBillingaddtxtareafld().sendKeys("bangalore");
	getShippingaddtxtareafld().sendKeys("bangalore");
	
	wb.select_DD(statusdropdown, 0);
	
	getAssignedtouserradiobtn().click();
	Thread.sleep(3000);
	
	wb.select_DD(invoicestatusdropdown, 5);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
	js.executeScript("window.scrollBy(0,500)");
	}

	
	itemnamelookupimg.click();
	
	wb.switchwindow(driver, "Products&action");
	
	getProductnamelink().click();
	
	
	wb.switchwindow(driver, "Sales");
	
	qtytxtfld.sendKeys("40");
	
	//savebtn.click();
	
}



public void tc11(WebDriver driver) throws InterruptedException
{
	createsalesbtn.click();
	
	getSubjecttxtfld().sendKeys("Samsungj7");
	orgimgbtn.click();
	
	WebDriver_Utilities wb=new WebDriver_Utilities();
	wb.switchwindow(driver, "Accounts&action");
	
	orgname.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	wb.switchwindow(driver, "Sales");
	
	getBillingaddtxtareafld().sendKeys("bangalore");
	getShippingaddtxtareafld().sendKeys("bangalore");
	
	wb.select_DD(statusdropdown, 0);
	
	getAssignedtouserradiobtn().click();
	
	wb.select_DD(assignedtouserdropdown, 0);
	Thread.sleep(3000);
	
	wb.select_DD(invoicestatusdropdown, 5);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
	js.executeScript("window.scrollBy(0,500)");
	}

	
	itemnamelookupimg.click();
	
	wb.switchwindow(driver, "Products&action");
	
	getProductnamelink().click();
	
	
	wb.switchwindow(driver, "Sales");
	
	qtytxtfld.sendKeys("40");
	
	//savebtn.click();
	
}

public void tc12(WebDriver driver) throws InterruptedException
{
	createsalesbtn.click();
	
	getSubjecttxtfld().sendKeys("Samsungj7");
	orgimgbtn.click();
	
	WebDriver_Utilities wb=new WebDriver_Utilities();
	wb.switchwindow(driver, "Accounts&action");
	
	orgname.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	wb.switchwindow(driver, "Sales");
	
	getBillingaddtxtareafld().sendKeys("bangalore");
	getShippingaddtxtareafld().sendKeys("bangalore");
	
	wb.select_DD(statusdropdown, 0);
	
	getAssignedtogroupradiobtn().click();
	wb.select_DD(assignedtogroupdropdown, 0);
	
	Thread.sleep(3000);
	
	wb.select_DD(invoicestatusdropdown, 5);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
	js.executeScript("window.scrollBy(0,500)");
	}

	
	itemnamelookupimg.click();
	
	wb.switchwindow(driver, "Products&action");
	
	getProductnamelink().click();
	
	
	wb.switchwindow(driver, "Sales");
	
	qtytxtfld.sendKeys("40");
	
	//savebtn.click();
	
}

public void tc13(WebDriver driver) throws InterruptedException
{
	createsalesbtn.click();
	
	getSubjecttxtfld().sendKeys("Samsungj7");
	orgimgbtn.click();
	
	WebDriver_Utilities wb=new WebDriver_Utilities();
	wb.switchwindow(driver, "Accounts&action");
	
	orgname.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	wb.switchwindow(driver, "Sales");
	
	getBillingaddtxtareafld().sendKeys("bangalore");
	getShippingaddtxtareafld().sendKeys("bangalore");
	
	wb.select_DD(statusdropdown, 0);
	
	getAssignedtogroupradiobtn().click();
	wb.select_DD(assignedtogroupdropdown, 1);	
	Thread.sleep(3000);
	
	wb.select_DD(invoicestatusdropdown, 5);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
	js.executeScript("window.scrollBy(0,500)");
	}

	
	itemnamelookupimg.click();
	
	wb.switchwindow(driver, "Products&action");
	
	getProductnamelink().click();
	
	
	wb.switchwindow(driver, "Sales");
	
	qtytxtfld.sendKeys("40");
	
	//savebtn.click();	
}

public void tc14(WebDriver driver) throws InterruptedException
{
	createsalesbtn.click();
	
	getSubjecttxtfld().sendKeys("Samsungj7");
	orgimgbtn.click();
	
	WebDriver_Utilities wb=new WebDriver_Utilities();
	wb.switchwindow(driver, "Accounts&action");
	
	orgname.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	wb.switchwindow(driver, "Sales");
	
	getBillingaddtxtareafld().sendKeys("bangalore");
	getShippingaddtxtareafld().sendKeys("bangalore");
	
	wb.select_DD(statusdropdown, 0);
	
	getAssignedtogroupradiobtn().click();
	wb.select_DD(assignedtogroupdropdown, 2);	
	Thread.sleep(3000);
	
	wb.select_DD(invoicestatusdropdown, 5);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
	js.executeScript("window.scrollBy(0,500)");
	}

	
	itemnamelookupimg.click();
	
	wb.switchwindow(driver, "Products&action");
	
	getProductnamelink().click();
	
	
	wb.switchwindow(driver, "Sales");
	
	qtytxtfld.sendKeys("40");
	
	//savebtn.click();	
}

public void tc15(WebDriver driver) throws InterruptedException
{
	createsalesbtn.click();
	
	getSubjecttxtfld().sendKeys("Samsungj7");
	orgimgbtn.click();
	
	WebDriver_Utilities wb=new WebDriver_Utilities();
	wb.switchwindow(driver, "Accounts&action");
	
	orgname.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	wb.switchwindow(driver, "Sales");
	
	wb.select_DD(carrierdropdown, 0);
	
	getBillingaddtxtareafld().sendKeys("bangalore");
	getShippingaddtxtareafld().sendKeys("bangalore");
	
	wb.select_DD(statusdropdown, 0);
	
	getAssignedtogroupradiobtn().click();
	wb.select_DD(assignedtogroupdropdown, 2);	
	Thread.sleep(3000);
	
	wb.select_DD(invoicestatusdropdown, 5);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
	js.executeScript("window.scrollBy(0,500)");
	}

	
	itemnamelookupimg.click();
	
	wb.switchwindow(driver, "Products&action");
	
	getProductnamelink().click();
	
	
	wb.switchwindow(driver, "Sales");
	
	qtytxtfld.sendKeys("40");
	
	//savebtn.click();	
}
}
