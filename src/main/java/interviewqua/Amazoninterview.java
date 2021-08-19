package interviewqua;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_script.WebDriver_Utilities;

public class Amazoninterview 
{

	public static void main(String[] args) {
		
	WebDriver_Utilities w=new WebDriver_Utilities();
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	w.implicityWait(d);
	w.maximizeWindow(d);
	
	d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 15000");
	d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	d.findElement(By.xpath("//span[.='Redmi']")).click();
	d.findElement(By.xpath("//span[.='Featured']")).click();
	d.findElement(By.xpath("//a[.='Price: High to Low']")).click();
	WebElement w1 = d.findElement(By.xpath("//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']/..//span[@class='a-price-whole']"));
	String txt = w1.getText();
	String s[]=txt.split(",");
	String str = s[0];
	String str1 = s[1];
	String b=str+str1;
	
//	StringBuffer s=new StringBuffer(txt);
//	s.deleteCharAt(txt.length()-4);
//int b=Integer.parseInt(s.toString());
	
	
	
int price = Integer.parseInt(b);
	if (price<15000) 
	{
	System.out.println(price);	
	} else 
	{
System.out.println("price is more than 15000");
	}
	
	d.close();
}
}