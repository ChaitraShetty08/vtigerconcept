package dataProvider;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Excel
{
@Test(dataProvider="getValues")
public void selectCities(String src, String dest) throws InterruptedException
{
	Date date=new Date();
	
	String currentdate=date.toString();
	
	String[] arr=currentdate.split(" ");
	
	String day=arr[0];
	String month=arr[1];
	String todaysdate=arr[2];
	String year=arr[5];
	
	String DMY=day+""+month+""+todaysdate+""+year;
	System.out.println(DMY);
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.makemytrip.com");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Actions a=new Actions(d);
	a.moveByOffset(10, 10).click().perform();
	
	d.findElement(By.id("fromCity")).sendKeys(src);
	Thread.sleep(3000);
	
	d.findElement(By.xpath("//div[text()='"+src+"']")).click();
	Thread.sleep(3000);
	
	d.findElement(By.id("toCity")).click();
	Thread.sleep(3000);
	
	d.findElement(By.xpath("//div[text()='"+dest+"']")).click();
	Thread.sleep(3000);		
	
	d.findElement(By.xpath("//span[.='DEPARTURE']")).click();
	Thread.sleep(3000);
	
	d.findElement(By.xpath("//div[@aria-label='"+DMY+"']")).click();
		
}
@DataProvider
	public Object[][] getValues()
	{
		Object[][] arr=new Object[5][2];
		arr[0][0]="BOM";
		arr[0][1]="BLR";
			
		arr[1][0]="BLR";
		arr[1][1]="PNQ";
		
		arr[2][0]="HYD";
		arr[2][1]="CCU";
		
		arr[3][0]="MAA";
		arr[3][1]="GOI";
		
		arr[4][0]="DXB";
		arr[4][1]="SIN";
	
		
		return arr;
		

	}
}
