package createorg;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MMT_Calender 


{
	@Test(dataProvider="getvalues")
	public void currentDate(String src, String dest) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.makemytrip.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Date date=new Date();
		
		System.out.println(date);
		//Sun Aug 22 11:27:37 IST 2021
		//	0		1    2		3			4		5
			
				String current = date.toString();
				String[] arr = current.split(" ");
				String day = arr[0];
				String month = arr[1];
				String currentdate = arr[2];
				String year = arr[5];
				String MMT_date = day+" "+month+" "+currentdate+" "+year;
				
				Actions actions=new Actions(d);
				actions.moveByOffset(10, 10).click().perform();
				
				d.findElement(By.id("fromCity")).sendKeys(src);
				Thread.sleep(1000);
				d.findElement(By.xpath("//div[text()='"+src+"']")).click();
				Thread.sleep(1000);
				d.findElement(By.id("toCity")).sendKeys(dest);
				Thread.sleep(1000);
				d.findElement(By.xpath("//div[text()='"+dest+"']")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("//span[text()='DEPARTURE']")).click();

				Thread.sleep(2000);

				d.findElement(By.xpath("//div[@aria-label='"+MMT_date+"']")).click();

	}
		@DataProvider
		public Object[][] getvalues() 
		{
			Object[] [] arr = new  Object[5] [2];

			arr[0][0]="BOM";
			arr[0][1]="PNQ";

			arr[1][0]="GOI";
			arr[1][1]="CCU";

			arr[2][0]="PNQ";
			arr[2][1]="MAA";

			arr[3][0]="DEL";
			arr[3][1]="BLR";

			arr[4][0]="HYD";
			arr[4][1]="CCU";

			return arr;


}
	}

	

