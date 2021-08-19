package createorg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepo.CreateOrganisationPage;
import com.objectrepo.HomePage;
import com.objectrepo.Loginpage;

import generic_script.JavaUtilities;
import generic_script.ReadDataProperty;
import generic_script.WebDriver_Utilities;

public class CreateOrg extends ReadDataProperty
{
	public WebDriver d;
	@Test
	public void createOrg() throws IOException
	{
		WebDriver_Utilities webUtilities=new WebDriver_Utilities();
		ReadDataProperty readprop=new ReadDataProperty();
		WebDriver d=new ChromeDriver();	
		webUtilities.implicityWait(d);
		
		
		d.get(readprop.readData("url"));
    	d.manage().window().maximize();
		
		String username = readprop.readData("UN");
		String password = readprop.readData("PWD");
		
		Loginpage lp=new Loginpage(d);
		lp.loginAppElements(username, password);
			
		
		JavaUtilities generalNo=new JavaUtilities();
		int randomnum = generalNo.randomNo();
		String random = "Chaitraa"+randomnum;
		//System.out.println(random);

	
		HomePage hp=new HomePage(d);
		hp.signOutInHomePage(d);
		
		CreateOrganisationPage createOrg=new CreateOrganisationPage(d);
		createOrg.createOrganisation(random);
		
		
		
		
		
}
}