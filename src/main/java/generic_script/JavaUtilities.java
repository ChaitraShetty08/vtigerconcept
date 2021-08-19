package generic_script;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author Chaitra Shetty Leo
 *
 *This class contains a generic methods for 
 *1) Generating a random numbers up to specific number.
 *2) Methods that fetches current date, day, month, year
 */
public class JavaUtilities
{
	/**
	 * @author Chaitra Shetty Leo
	 * This method will generate random numbers up to 1000 in order to reduce the repetition of test data scripts.
	 * @return
	 */
	public int randomNo()
	{
		Random r=new Random();
		int ranNum=r.nextInt(1000);
		return ranNum;
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will fetch the current day 
	 * @return
	 */
	public String currentDay()
	{
		Date date=new Date();
		String currentdate=date.toString();
		String[] arr=currentdate.split(" ");
		String day=arr[0];
		return day;
	}
	/**
	 * @author Chaitra Shetty Leo
	 * This method will fetch the current month 
	 * @return
	 */
	public String month()
	{
		Date date=new Date();
		String currentdate=date.toString();
		String[] arr=currentdate.split(" ");
		String month=arr[1];

		return month;
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will fetch the current date. 
	 * @return
	 */
	public String currentDate()
	{
		Date date=new Date();
		String currentdate=date.toString();
		String[] arr=currentdate.split(" ");
		String todaysdate=arr[2];
		return todaysdate;
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will fetch the current year 
	 * @return
	 */
	public String year()
	{
		Date date=new Date();
		String currentdate=date.toString();
		String[] arr=currentdate.split(" ");
		String year=arr[5];
		return year;
	}
	
}