package com.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContactsPage 
{
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnametxtfld;

	public WebElement getLastnametxtfld() {
		return lastnametxtfld;
	}
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public void createcontact()
	{
		lastnametxtfld.sendKeys("zxcv");
		savebtn.click();
	}
	
	
}
