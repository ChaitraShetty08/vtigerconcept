package generic_script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.objectrepo.HomePage;
import com.objectrepo.Loginpage;

public class BaseClass 
{
	public WebDriver d;
	public WebDriver_Utilities webu=new WebDriver_Utilities();
	public	ReadDataProperty p=new ReadDataProperty();
	public Loginpage lp=new Loginpage(d);
	public JavaUtilities r=new JavaUtilities();

	@Parameters("BROWSER")
	
	@BeforeClass(groups={"Regressiontest"})
	public void launchBrowser() throws IOException
	{
		//String BROWSER=System.getProperty("browser");
		String BROWSER = p.readData("browser");
		if (BROWSER.equals("chrome")) 
		{
			d=new ChromeDriver();	
		} 
		else if (BROWSER.equals("firefox"))
		{
			d=new FirefoxDriver();
		}
		else
		{
			d=new ChromeDriver();
		}


	}

	@BeforeMethod(groups={"Regressiontest","Smoketest"})
	public void logintoVtiger() throws IOException
	{
		//String URL=System.getProperty("url");
		//d.get(URL);
		d.get(p.readData("url"));
		webu.implicityWait(d);
		webu.maximizeWindow(d);

		Loginpage lp=new Loginpage(d);
		lp.loginAppElements(p.readData("UN"), p.readData("PWD"));

	}

	@AfterMethod(groups={"Regression test","Smoke test"})
	public void logoutVtiger()
	{
		HomePage hp=new HomePage(d);
		hp.signOutInHomePage(d);
	}

	@AfterClass(groups={"Regression test","Smoke test"})
	public void closeBrowser()
	{
		d.close();
	}
}
