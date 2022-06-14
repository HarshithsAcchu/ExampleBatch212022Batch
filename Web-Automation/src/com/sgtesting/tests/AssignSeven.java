package com.sgtesting.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignSeven {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		
		
			
			

				launchBrowser();
				navigate();
				login();
				minimizeFlyOutWindow();
				createcustomer();
				createProject();
				createTask();
				deleteTask();
				deleteProject();
				deletecustomer();
		        logout();
			    closeAplication();
			}
			private static void launchBrowser()
			{
				try
				{


					System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");

					oBrowser = new ChromeDriver();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void navigate()
			{
				try
				{
					oBrowser.get("http://localhost:81/login.do");
					Thread.sleep(4000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void login()
			{
				try
				{
					oBrowser.findElement(By.id("username")).sendKeys("admin");
					oBrowser.findElement(By.name("pwd")).sendKeys("Manager");
					oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
					Thread.sleep(4000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void minimizeFlyOutWindow()
			{
				try
				{
					oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void createcustomer()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Apple");
					oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
					Thread.sleep(3000);


				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void createProject()
			{
				try
				{

					oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
					Thread.sleep(20000);
					oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
					Thread.sleep(20000);
					oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Development of The new software");
					Thread.sleep(20000);
					oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("To develop the New software of the Apple Company");
					Thread.sleep(20000);
					oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
					Thread.sleep(4000);

				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			private static void createTask()
			{
				try 
				{
					oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("Task1");
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
					Thread.sleep(2000);


				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}

			private static void deleteTask()
			{
				try 
				{
					oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
					Thread.sleep(3000);
					oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[1]")).click();
					Thread.sleep(4000);
					oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
					Thread.sleep(4000);
					oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
					Thread.sleep(3000);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}



			private static void deleteProject()
			{
				try 
				{
					//oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
					//	Thread.sleep(20000);
					oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
					Thread.sleep(3000);
					oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[1]")).click();
					Thread.sleep(3000);
					oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
					Thread.sleep(3000);
					oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
					Thread.sleep(3000);

				} catch (Exception e) 
				{

				}
			}

			private static void deletecustomer()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
					Thread.sleep(2000);

				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			private static void logout()
			{
				try
				{
					oBrowser.findElement(By.linkText("Logout")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void closeAplication()
			{
				try {

					oBrowser.close();

				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
}