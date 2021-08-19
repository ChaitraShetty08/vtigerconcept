package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	
	@Test(dataProvider="getValue")
	public void data(String s1, String s2)
	{
		System.out.println(s1+" "+s2);
	}
	
	@DataProvider
	public Object[] [] getValue()	
	{
		Object[][] arr=new Object[6] [2];
		arr[0][0]="us1";
		arr[0][1]="psd1";
			
		arr[1][0]="us2";
		arr[1][1]="psd2";
		
		arr[2][0]="us3";
		arr[2][1]="psd3";
		
		arr[3][0]="us4";
		arr[3][1]="psd4";
		
		arr[4][0]="us5";
		arr[4][1]="psd5";
		
		arr[5][0]="us6";
		arr[5][1]="psd6";
		
		return arr;
		
	}
}
