package day40;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	//WebDriver instance
	WebDriver driver;
	
	//Constructor
	public LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	//Locator + Identification
	
	@FindBy(xpath="//div[@class='orangehrm-login-slot-wrapper']")
	WebElement logo;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_login;
		
	
	//Action Method
	
	public boolean checkLogoPresence()
	{
		boolean status=logo.isDisplayed();
		return status;
	}
	
	public void setUserName(String name)
	{
		WebElement user=txt_username;
		user.clear();
		user.sendKeys(name);
	}

	public void setPassword(String pwd)
	{
		WebElement pass=txt_password;
		pass.clear();
		pass.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}

	

	
	
}
