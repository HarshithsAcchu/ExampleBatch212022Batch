package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	//username text field
	private WebElement  username;
	public WebElement getUserName()
	{
		return username;
	}
		
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutButton()
	{
		return oLogout;
	}
	
	//user1
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oUser;
	public WebElement getUserButton()
	{
		return oUser;
				
	}
	//AddingUser1
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement oAdduser;
	public WebElement getAddUserButton()
	{
		return oAdduser;
	}
	//Adding1Stname
	private WebElement firstName;
	public WebElement getFirstName1()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement getlastName1()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement getEmail1()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername1()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getUser1Password()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getUser1ReEnterPassword()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
	private WebElement oCreateUser;
	public WebElement getCreateUser1()
	{
		return oCreateUser;
	}
@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oClickUser1;
	public WebElement getClickUserOne()
	{
		return oClickUser1;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleteUser1()
	{
		return userDataLightBox_deleteBtn;
	}
	//ModifyUser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oSaveUser1 ;
	public WebElement getClickSaveModifyUser1()
	{
		return oSaveUser1;
	}
	//click on task
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement oClickTask;
	public WebElement getClickTask()
	{
		return oClickTask;
	}
	//click on addtask
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oClickAddNew;
	public WebElement getClickOnAddNewTask()
	{
		return oClickAddNew;
	}
	//click on addcustomerbutton
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oClickAddCustomer;
	public WebElement getClickOnAddCustomer()
	{
		return oClickAddCustomer;
	}
	//add customer name
	private WebElement customerLightBox_nameField;
	public WebElement getWriteCustomerName()
	{
		return customerLightBox_nameField;
	}
	//create customer save button
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement oClickOnCreateCustomer;
	public WebElement getoClickOnCreateCustomer()
	{
		return oClickOnCreateCustomer;
	}
	//click on customer name for deleting 
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oClickonCustomerName;
	public WebElement getClickonCustomerName()
	{
		return oClickonCustomerName;
	}
	//click on delete button at customer point
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement oClickonCustomerDelete;
	public WebElement getClickonCustomerDelete()
	{
		return oClickonCustomerDelete;
	}
	//////////////////////////////////////
	//click on delete pop up button at customer point
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
		private WebElement oClickonCustomerDeletepopup;
		public WebElement getClickonCustomerDeletepopup()
		{
			return oClickonCustomerDeletepopup;
		}
	
	//--------------------------------------
		private WebElement customerPanel_deleteConfirm_submitTitle;
		public WebElement getClickonCustomerDeletePermission()
		{
			return customerPanel_deleteConfirm_submitTitle;
		}

	

}
