package com.sgtesting.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignOne {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {



		launchBrowser();
		navigate();
		Login();
		minimizeflywindow();
		Createuser();
		DeleteUser1() ;
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
	private static void Createuser()
	{
		try 
		{
			oPage.getUserButton().click();
			Thread.sleep(2000);
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName1().sendKeys("Harsh");
			Thread.sleep(2000);
			oPage.getlastName1().sendKeys("shith");
			Thread.sleep(2000);
			oPage.getEmail1().sendKeys("Harsh@gmail.com");
			Thread.sleep(2000);
			oPage.getusername1().sendKeys("Acchu");
			Thread.sleep(2000);
			oPage.getUser1Password().sendKeys("123");
			Thread.sleep(2000);
			oPage.getUser1ReEnterPassword().sendKeys("123");
			Thread.sleep(2000);
			oPage.getCreateUser1().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser1() 
	{
		try 
		{
			oPage.getClickUserOne().click();
			Thread.sleep(3000);
			oPage.getDeleteUser1().click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
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