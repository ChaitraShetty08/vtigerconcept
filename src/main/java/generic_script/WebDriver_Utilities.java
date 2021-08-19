package generic_script;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Chaitra Shetty Leo
 *
 *This class contains a generic methods for 
 *1) Selects a drop down based on index,value & visible text. 
 *2)  Switches to a frame based on index,name & element(ref.variable). 
 *3) Switches to a particular window based on the title.
 */
public class WebDriver_Utilities implements AutoConstant
{
	/**
	 * @author Chaitra Shetty Leo
	 * This method will select the drop down option based on the index
	 * @param element
	 * @param index
	 */
	public void select_DD(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will select the drop down option based on the value
	 * @param element
	 * @param value
	 */
	public void select_DD(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will select the drop down option based on the visible text
	 * @param text
	 * @param element
	 */
	public void select_DD(String text,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will switch the frame based on the  frame's name
	 * @param driver
	 * @param name
	 */
	public void switchframe(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will switch the frame based on the  frame's ID
	 * @param driver
	 * @param id
	 */
	public void switchframe(WebDriver driver,int id)
	{
		driver.switchTo().frame(id);
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will switch the frame based on the WebElement's reference variable(element)
	 * @param driver
	 * @param element
	 */
	public void switchframe(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will wait Implicitly for 10 seconds which is implemented from AutoConstant interface
	 * @param driver
	 */
	public void implicityWait(WebDriver d)
	{
		d.manage().timeouts().implicitlyWait(AutoConstant.implictwait, TimeUnit.SECONDS);
	}

	/**
	 * @author Chaitra Shetty Leo
	 * This method will wait Explicitly for 10 seconds which is implemented from AutoConstant interface
	 * @param driver
	 */
	


	/**
	 * @author Chaitra Shetty Leo
	 * This method is used for switching to a particular frame
	 * @param driver
	 * @param title
	 */
	public void switchwindow(WebDriver driver, String title)
	{
		Set<String> windowsID = driver.getWindowHandles();
		Iterator<String> it = windowsID.iterator();
		while(it.hasNext())
		{
			String window = it.next();
			String currenttitle = driver.switchTo().window(window).getTitle();
			if(currenttitle.contains(title))
			{
				break;
			}
		}
	}	
	
	/**
	 * @author Chaitra Shetty Leo
	 * This method will move the cursofr to an particular element.
	 * @param driver
	 * @param element
	 */
	public void moveToElement(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element);
	}
	
	/**
	 * @author Chaitra Shetty Leo
	 * This method is used to maximize the window 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void alterPopup(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public void scrollTo(WebDriver driver,  WebElement location)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e=location;
		Point loc = e.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
	    e.click();
		
	}
	}



