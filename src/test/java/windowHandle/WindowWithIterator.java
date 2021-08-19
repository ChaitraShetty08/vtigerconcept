package windowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowWithIterator 
{
public static void main(String[] args) 
{
	WebDriver d=new ChromeDriver();	
	d.get("https://www.naukri.com/");

	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Set<String> window = d.getWindowHandles();
	
	Iterator<String> title=window.iterator();
	
	while(title.hasNext())
	{
		String getwindow = title.next();
		d.switchTo().window(getwindow).getTitle();
		if(d.getTitle().contains("Tech Mahindra")){
			

		d.close();
		}
	}
}
}
