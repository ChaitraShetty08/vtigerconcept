package generic_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent 
{

	WebDriver d=new ChromeDriver();
	ExtentHtmlReporter reporter; //This is used to set the path and give set some configuration.
	ExtentReports reports; //This is used to attach the report for the test script execution.
	ExtentTest test; // This is used to create the entries.

	@BeforeSuite
	public void setUp()
	{
		reporter=new ExtentHtmlReporter(AutoConstant.ExtentReportPath+".html");
		reporter.config().setDocumentTitle("Vtiger Report");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Execution Reports of Vtiger application for Smoke");


		reports=new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("BuildNo", "1.0.1");
		reports.setSystemInfo("Envinorment", "QA");
		reports.setSystemInfo("Platform", "Windows 10");
		reports.setSystemInfo("Reporter", "Chaitra");
	}

	@Test
	public void test1()
	{
		test=reports.createTest("test1");
		d.get("https://www.facebook.com");
		System.out.println(d.getTitle());
	}
	@Test
	public void test2()
	{
		test=reports.createTest("test2");
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
	}
	@AfterSuite
	public void close()
	{
		reports.flush();
	}
}
