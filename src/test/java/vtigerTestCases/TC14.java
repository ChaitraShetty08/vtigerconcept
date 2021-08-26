package vtigerTestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.objectrepo.CreateSalesOrderPage;
import com.objectrepo.HomePage;

import generic_script.BaseClass;

public class TC14 extends BaseClass
{
	@Test(groups="Smoketest")
	public void testCase14() throws IOException, InterruptedException
	{
		
		HomePage hp=new HomePage(d);
		hp.moreLinkInHomePage(d);

		CreateSalesOrderPage sales=new CreateSalesOrderPage(d);
		sales.getCreatesalesbtn().click();
		sales.getSubjecttxtfld().sendKeys("Samsungj7"); 	
		sales.getOrgimgbtn().click();
		webu.switchwindow(d, "Accounts&action");
		sales.getSearchordnametxtfld().sendKeys("Samsung");
		sales.getSearchnowbtn().click();
		sales.getOrgname().click();
		webu.alterPopup(d);
		Thread.sleep(3000);
		webu.switchwindow(d, "SalesOrder&action");
		Thread.sleep(3000);

		webu.scrollTo(d, sales.getBillingaddtxtareafld());
		Thread.sleep(3000);

		sales.getBillingaddtxtareafld().sendKeys(p.readData("billingadd"));
		sales.getShippingaddtxtareafld().sendKeys(p.readData("shippingadd"));

		webu.scrollTo(d, sales.getStatusdropdown());
		webu.select_DD(sales.getStatusdropdown(), 0);
		
		webu.scrollTo(d, sales.getAssignedtogroupradiobtn());
		sales.getAssignedtogroupradiobtn();
		webu.select_DD(sales.getAssignedtogroupdropdown(), 3);
		Thread.sleep(3000);

		webu.scrollTo(d, sales.getInvoicestatusdropdown());
		webu.select_DD(sales.getInvoicestatusdropdown(), 5);

		webu.scrollTo(d, sales.getItemnamelookupimg());
		sales.getItemnamelookupimg().click();
		Thread.sleep(3000);

		webu.switchwindow(d, "Products&action");
		sales.getProductnamelink().click();
		Thread.sleep(3000);
		webu.switchwindow(d, "Sales");
		Thread.sleep(3000);
		sales.getQtytxtfld().sendKeys("40");
		Thread.sleep(3000);
		//sales.getSavebtn().click();
}
}
