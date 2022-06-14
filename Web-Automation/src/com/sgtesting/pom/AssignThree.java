package com.sgtesting.pom;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignThree {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {


	
	



		launchBrowser();
		navigate();
		Login();
		minimizeflywindow();
		CreateCustomer();
		DeleteCustomer();
		logout() ;
		closeapplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do");

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("Manager");
			Thread.sleep(2000);
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflywindow()
	{
		try 
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CreateCustomer()
	{
		try 
		{
			oPage.getClickTask().click();
			Thread.sleep(2000);
			oPage.getClickOnAddNewTask().click();
			Thread.sleep(2000);
			oPage.getClickOnAddCustomer().click();
			Thread.sleep(2000);
			oPage.getWriteCustomerName().sendKeys("Darshan");
			Thread.sleep(2000);
			oPage.getoClickOnCreateCustomer().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	private static void DeleteCustomer() 
	{
		try 
		{
			oPage.getClickonCustomerName().click();
			Thread.sleep(3000);
			oPage.getClickonCustomerDelete().click();
			Thread.sleep(3000);
			oPage.getClickonCustomerDeletepopup().click();
			Thread.sleep(2000);
			oPage.getClickonCustomerDeletePermission().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}  
	}
	private static void logout() 
	{
		try 
		{
			oPage.getLogoutButton().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}  
	}
	private static void closeapplication()
	{
		try 
		{
			oBrowser.quit();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}  
	}
}