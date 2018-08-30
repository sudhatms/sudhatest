package com.screenfunctions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.Genericfunctions;

public class Homepage extends Genericfunctions {

	//*************** Menu Strip ********************
	@FindBy(how = How.XPATH,using ="//img[contains(@src,'header')]")
	public static WebElement Header_Section;
	//WebElement of HomeTab
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Home']")
	public static WebElement Tab_Home_Homepage;
    //WebElement of Admin Tab in homepage
	@FindBy(how=How.XPATH,using ="//a[normalize-space(text())='Admin']")
	public static WebElement Tab_Admin_Homepage;
  //WebElement of staff tab
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Staff']")
	public static WebElement Tab_Staff_Homepage;
	//WebElement of Features tab
	@FindBy(how = How.XPATH,using="//a[normalize-space(text())='Staff']/following::a[1]")
	public static WebElement Tab_Features_Homepage;
	//WebElement of Admin title
	@FindBy(how = How.XPATH,using ="//a[text()='Admin Login']")
	public static WebElement Text_Admin_Login;
    //WebElement of Staff title
	@FindBy(how= How.XPATH,using="//*[text()='Staff Login']")
	public static WebElement Text_Staff_Login;
	//WebElement of Online bankinf features text
	@FindBy(how= How.XPATH,using="//*[text()='Online Banking features']")
	public static WebElement Text_Features_Login;
	//WebElement of ContactUs text
	@FindBy(how= How.XPATH,using="(//*[text()='Contact Us'])[3]")
	public static WebElement ContactusText_Login;
	//WebElement of Username field
	
	public static List<String> tabs=new ArrayList<String>();



	//***********************************************


	//******To verify the HeaderSection  

	public static boolean verifyHeaderSectionLogo()
	{

		boolean status = true;
		try
		{
			String x = "ONLINE BANKING SYSTEM";
			if(Header_Section.getText().equals(x))
			{
				System.out.println("Logo is displayed in the Header Section on Homepage");

			}
		}
		catch(Exception e)
		{
			status = false;
			System.out.println(e.getMessage());
			System.out.println("Unable to find the logoon the Homepage ");
		}
		return status;
	}

	//********************************

	//****** To verify Tabs Order


	public static void verifyTabsOrder()
	{ boolean status  = true;

	List<WebElement> alltabs=driver.findElements(By.xpath("//a[normalize-space(text())='Home']/parent::li/following-sibling::li/a"));

	try{ 



		for(int i=0;i<=alltabs.size()-1;i++)
		{		
			tabs.add(alltabs.get(i).getText().trim());			

		}


		String[] taborder={"Admin","Staff","Features","Contact Us"};


		for(int j=0;j<=taborder.length-1;j++)
		{
			if(tabs.get(j).equals(taborder[j]))
			{
				System.out.println(tabs.get(j)+ " Is in expected order");

			}
			else
			{
				System.out.println(tabs.get(j)+ " Is not in expected order");
			}

		}
	}
	catch(Exception e) {
		status = false;
		System.out.println(e.getMessage());
		System.out.println("Unable to find the tabs");
	}
	
	}
	//*************************************
	//********* To verify Links navigation

	public static void linkNavigation(){

		List<WebElement> alltabs1=driver.findElements(By.xpath("//a[normalize-space(text())='Home']/parent::li/following-sibling::li/a"));

		System.out.println(alltabs1.size());


		for(int i=0;i<=alltabs1.size()-1;i++)
		{	



			System.out.println(alltabs1.get(i).getText());

			try {

				switch(alltabs1.get(i).getText().trim())
				{

				case "Admin":

					elementDisplay(Tab_Admin_Homepage);
					System.out.println("add");

					break;
				case "Staff":

					elementDisplay(Text_Staff_Login);

					break;
				case "Features":
					elementDisplay(Text_Features_Login);
					break;

				case "Contact Us" :
					elementDisplay(ContactusText_Login);

					break;
				}
			}
				catch(Exception e)
				{
					
					System.out.println(e.getMessage());	
								
				}
								
			
					alltabs1.get(i).click();	

					driver.navigate().back();

					alltabs1=driver.findElements(By.xpath("//a[normalize-space(text())='Home']/parent::li/following-sibling::li/a"));

				}

	

			}

		}	

