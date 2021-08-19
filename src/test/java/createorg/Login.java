package createorg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
public static void main(String[] args) 
{
	WebDriver d=new ChromeDriver();	
	d.get("http://localhost:8888/");
	
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	d.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	d.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
d.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	
	
	d.findElement(By.xpath("//td[.='Organizations']")).click();
	d.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	d.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Chaitra shetty");
	d.findElement(By.xpath("//input[@name='website']")).sendKeys("ingenutias.com");
	d.findElement(By.xpath("//input[@id='tickersymbol']")).sendKeys("tool");
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
	d.findElement(By.xpath("(//input[@name='button'])[1]")).click();
}
}
