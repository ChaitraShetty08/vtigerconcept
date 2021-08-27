package generic_script;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener
{
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	public void onFinish(ITestContext arg0)
	{
		reports.flush();
	}

	public void onStart(ITestContext context) 
	{
		JavaUtilities j=new JavaUtilities();
		String date = j.currentDate();
		reporter=new ExtentHtmlReporter(AutoConstant.ExtentReportPath+date+".html");
		reporter.config().setDocumentTitle("Vtiger Report"+j.randomNo());
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Execution Reports of Vtiger application for Smoke");


		reports=new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("BuildNo", "1.0.1");
		reports.setSystemInfo("Envinorment", "QA");
		reports.setSystemInfo("Platform", "Windows 10");
		reports.setSystemInfo("Reporter", "Chaitra");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{

	}

	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL, result.getName()+" is Passed");
		test.log(Status.FAIL, result.getThrowable());
		try 
		{
			String path = BaseClass.getScreenshot(result.getName());
			test.addScreenCaptureFromPath(path);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) 
	{
		test.log(Status.SKIP, result.getMethod().getMethodName()+" Skipped");
	}

	public void onTestStart(ITestResult result) 
	{
		test=reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, result.getMethod().getMethodName()+" is Passed");
	}

}
