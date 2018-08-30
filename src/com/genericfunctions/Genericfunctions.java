package com.genericfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Genericfunctions {
	public static WebDriver driver;
	static boolean status;
	static Actions 	acc;
	/*Method name : LaunchBrowser
	 * Description :To  Launch browser
	 * Input : Browser type, url
	 * 
	 * Output: Browser Launch,Application launch
	 */
	
	
	public static boolean launchBrowser(String browsertype ,String url)
	{
		
		try
		{
			switch(browsertype.toLowerCase())
			{
			case "ff" : 
				driver = new FirefoxDriver();
				driver.get(url);
				Thread.sleep(5000);
				break;
			}
			driver.manage().window().maximize();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			status = false;
		}
		return status;


	}
	/* Method name : clickandClear
	 * Description: To click on text field and send data
	 *  Input: providing Element details 
	 * Output:                                      */
/*************To click and clear*/

	public static boolean clickandClear(WebElement element,String data )
	{   
		
		try
		{    acc =new Actions(driver);
			acc.moveToElement(element).click().build().perform();
			
			//element.clear();
			
			element.sendKeys(data);			
		
			

		}catch(Exception e)
		{
			status=false;
			System.out.println(e.getMessage());
			
			System.out.println("Unable to enter data into the element "+element);
		}
		
		return status;
		
	}

    /* method  name: movetoElement
     * Description: To move to required element
        Input: Providing the element details to operate*/
	
	/************To move to Element***************/
	public void moveToLink(String linktext){
		
		WebElement e = driver.findElement(By.xpath("linktext"));
		acc = new Actions(driver);
		acc.moveToElement(e).build().perform();
	}

/*********To verify element is available************/
	public static boolean elementDisplay(WebElement e )
	{
		if(e.isDisplayed())
		{
			System.out.println("The navigation is working");
		}

		return status;	
	}
           /***** To sendData**********/
	public static boolean senddata(WebElement e, String data)
   
	{
	try
	{
		e.sendKeys(data);
	   
}
catch(Exception ex)
	{
	System.out.println(ex.getMessage());
	}
	 return status;
	}
	/***********To click an element**********/
	
	public static boolean clickElement(WebElement e)
	{
    try {
    	e.click();
    }
  
    catch(Exception ex)
    {
    	System.out.println(ex.getMessage());
    }
    
    return status;
    }
   
public static boolean selectElement(WebElement e,String text)
{
	try {
		
	
	Select s = new Select(e);
 s.selectByVisibleText(text);


}
catch(Exception ex)
{
	System.out.println(ex.getMessage());
}

return status;
}
}