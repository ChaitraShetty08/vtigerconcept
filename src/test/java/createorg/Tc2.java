package createorg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc2 
{
	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();	
		d.get("http://localhost:8888/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@type='submit']")).click();
		d.findElement(By.xpath("//td[.='Organizations']")).click();
		d.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		d.findElement(By.xpath("//input[@name='accountname']")).sendKeys("shetty");
		d.findElement(By.xpath("//input[@name='website']")).sendKeys("ingenutias.com");
		d.findElement(By.xpath("//input[@name='account_name']")).sendKeys("company");
		d.findElement(By.xpath("//input[@name='employees']")).sendKeys("50");
		d.findElement(By.xpath("//input[@name='email2']")).sendKeys("chaitrashetty948@gmail.com");
		d.findElement(By.xpath("//input[@name='phone']")).sendKeys("8884606545");
		d.findElement(By.xpath("//input[@name='fax']")).sendKeys("15896");
		d.findElement(By.xpath("//input[@name='otherphone']")).sendKeys("0123456789");
		d.findElement(By.xpath("//input[@name='email1']")).sendKeys("chaitrank.rpea16@gmail.com");
		d.findElement(By.xpath("//input[@name='ownership']")).sendKeys("Lord Bhrama");
		d.findElement(By.xpath("//input[@name='siccode']")).sendKeys("siccode");
		d.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("000001");
		WebElement w = d.findElement(By.xpath("//select[@name='industry']"));
		Select s=new Select(w);
		s.selectByIndex(11);

		WebElement w1 = d.findElement(By.xpath("//select[@name='accounttype']"));
		Select s1=new Select(w1);
		s1.selectByIndex(5);

		WebElement w2=d.findElement(By.xpath("//select[@name='rating']"));
		Select s2=new Select(w2);
		s2.selectByIndex(5);

		d.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		//d.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		d.findElement(By.xpath("//img[@title='Select']")).click();


		Set<String> options = d.getWindowHandles();
		for (String wh : options) 
		{
			d.switchTo().window(wh);
		}

		d.findElement(By.xpath("//a[.='shetty']")).click();
		Alert a = d.switchTo().alert();
		a.accept();

	}		
}
