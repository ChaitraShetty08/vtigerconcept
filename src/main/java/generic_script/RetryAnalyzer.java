package generic_script;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{

	public boolean retry(ITestResult result) 
	{
		int count=0;
		int retrycount=4;
		while(count<retrycount)
		{
			count++;
			return true;
		}
		return false;
	}

}
