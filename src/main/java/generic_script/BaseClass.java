package generic_script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.objectrepo.HomePage;
import com.objectrepo.Loginpage;

public class BaseClass 
{
	public WebDriver d;
	public WebDriver_Utilities webu=new WebDriver_Utilities();
	public	ReadDataProperty p=new ReadDataProperty();
	public Loginpage lp=new Loginpage(d);
	public JavaUtilities r=new JavaUtilities();
	public static WebDriver staticd;


	//@Parameters("BROWSER")

	@BeforeClass(groups={"Regressiontest","Smoketest"})
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
	public void logintoVtiger() throws IOException, InterruptedException
	{
		//String URL=System.getProperty("url");
		//d.get(URL);
		d.get(p.readData("url"));
		webu.implicityWait(d);
		webu.maximizeWindow(d);
		staticd=d;

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

	public static String getScreenshot(String name) throws IOException
	{
		File srcFile=((TakesScreenshot) staticd).getScreenshotAs(OutputType.FILE);
		String destFile=System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest=new File(destFile);
		FileUtils.copyFile(srcFile, finaldest);

		return destFile;


		//	String photo="/Screenshots";
		//	String date = r.currentDate();
		//	TakesScreenshot tss=(TakesScreenshot)d;
		//	File src = tss.getScreenshotAs(OutputType.FILE);
		//	File dest=new File(photo+date+".jpeg");
		//	FileUtils.copyFile(src, dest);
	}
}
