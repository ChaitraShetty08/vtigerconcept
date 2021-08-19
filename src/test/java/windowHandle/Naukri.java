package windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver d=new ChromeDriver();	
	d.get("https://www.naukri.com/");

	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Set<String> window = d.getWindowHandles();
	
	for (String w:window) 
	{
		d.switchTo().window(w);
	String txt = d.getTitle();
Thread.sleep(2000);

	if (txt.equals("Tech Mahindra")) 
	{
	d.close();		
	}
	}
}
}
