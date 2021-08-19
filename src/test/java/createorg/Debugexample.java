package createorg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugexample 
{

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();	
		d.get("http://localhost:8888/");
	
		d.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@name='user_passwod']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@type='submit']")).click();	
}
}
