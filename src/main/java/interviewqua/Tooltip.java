package interviewqua;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepo.CreateSalesOrderPage;
import com.objectrepo.HomePage;
import com.objectrepo.Loginpage;

import generic_script.ReadDataProperty;
import generic_script.WebDriver_Utilities;

public class Tooltip 
{
	public static void main(String[] args) throws IOException {
		
		ReadDataProperty r=new ReadDataProperty();
		WebDriver_Utilities w=new WebDriver_Utilities();
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8888/");
		w.implicityWait(d);
		w.maximizeWindow(d);
		
		Loginpage lp=new Loginpage(d);
		lp.loginAppElements(r.readData("UN"), r.readData("PWD"));
		
		HomePage hp=new HomePage(d);
		hp.moreLinkInHomePage(d);
		
		CreateSalesOrderPage c=new CreateSalesOrderPage(d);
		String tool = c.getCreatesalesbtn().getAttribute("title");
		System.out.println(tool);
		d.close();
	}
}
