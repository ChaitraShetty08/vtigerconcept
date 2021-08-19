package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
  
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, OrganizationPage.this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrgimg;

	public WebElement getCreateOrgimg() 
	{
		return createOrgimg;
	}
	
	public void organizationElements()
	{
		
	}
}
