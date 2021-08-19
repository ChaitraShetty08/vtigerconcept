package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Chaitra Shetty Leo
 *
 *This class is used for creating a new Organisation.
 */
public class CreateOrganisationPage 
{

	/**
	 * @author Chaitra Shetty Leo
	 * This constructor is used to point the current web object or page.
	 * @param driver
	 */
	public CreateOrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, CreateOrganisationPage.this);
		}

	@FindBy(xpath="//td[.='Organizations']")
	private WebElement orglink;

	/**
	 * @author Chaitra Shetty Leo
	 * This method is used to get the value of Organization link in the home page.
	 * @return
	 */
	public WebElement getOrglink() 
	{
		return orglink;
	}
	
@FindBy(xpath="//img[@title='Create Organization...']")
private WebElement createorgimg;

@FindBy(xpath="//input[@title='Save [Alt+S]'])[2]")
private WebElement savebtn;


	/**
	 * @author Chaitra Shetty Leo
	 *  This method is used to get the value of Organization image in the Organization page.
	 * @return
	 */
	public WebElement getCreateorgimg() 
	{
	return createorgimg;
}

/**
 * @author Chaitra Shetty Leo
 *  This method is used to save the Organization name in the create Organization page.
 * @return
 */
	public WebElement getSavebtn() 
	{
		return savebtn;
	}
	
    /**
     * @author Chaitra Shetty Leo
     *  This method is used to create an organization using organization name.
     * @param random
     */
	public void createOrganisation(String random)
	{
		getOrglink().click();
		getCreateorgimg().click();
		getSavebtn().click();
	}

	
}
