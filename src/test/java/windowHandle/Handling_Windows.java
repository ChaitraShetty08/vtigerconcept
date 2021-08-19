package windowHandle;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_script.JavaUtilities;
import generic_script.ReadDataProperty;

public class Handling_Windows 
{
	@Test
	public void createOrg() throws IOException
	{

		ReadDataProperty readprop=new ReadDataProperty();
		WebDriver d=new ChromeDriver();	
		d.get(readprop.readData("url"));



		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String username = readprop.readData("UN");
		String password = readprop.readData("PWD");
	
		
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		d.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		d.findElement(By.xpath("//input[@type='submit']")).click();
		d.findElement(By.xpath("//td[.='Organizations']")).click();
		d.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		JavaUtilities generalNo=new JavaUtilities();
		int randomnum = generalNo.randomNo();
		String random = "Chaitraa"+randomnum;
		System.out.println(random);
		d.findElement(By.xpath("//input[@name='accountname']")).sendKeys(random);
	
}
}
