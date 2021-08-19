package createorg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfctc {

	public static void main(String[] args) 
	{
	WebDriver d=new ChromeDriver();
	d.get("https://www.hdfcbank.com/");
	
	//d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	d.findElement(By.xpath("//a[.='Select Product Type']")).click();
	
	List<WebElement> l = d.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	
	 for (int i = 0; i <l.size(); i++)
	  {
		 
		  String t2 = l.get(i).getText();
		
		  System.out.println(t2);
		
	
	 l.get(4).click();
	

	
	d.findElement(By.xpath("//a[.='Select Product']")).click();
  List<WebElement> m = d.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
 
  
  for (int j= 0; j <m.size(); j++)
  {
	
	  String t1 = m.get(j).getText();
	  System.out.println("\t \t 2st drop");
	  System.out.println(t1);
	 m.get(5).click();
	System.out.println();
	
  }
	  }
	}
	 }


		
	
	
/*for (WebElement w : l) 
{
	String txt=w.getText();
	System.out.println("\t \t1st drop");
	System.out.println(txt);
	if(txt.contains("Loans"))
	{
		w.click();
}
}*/

/*for (WebElement e : m) 
{
	  String text=e.getText();
	  System.out.println("\t \t 2st drop");
		System.out.println(text);
		if(text.contains("SmartEMi"))
		{
			e.click();
		}
}*/
