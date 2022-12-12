package day40;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	//WebDriver instance
	WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	//Locators
	By img_logo    =  By.xpath("//div[@class='orangehrm-login-slot-wrapper']");
	By txt_username=  By.xpath("//input[@placeholder='Username']");
	By txt_password=  By.xpath("//input[@placeholder='Password']");
	By btn_login   =  By.xpath("//button[@type='submit']");
	
	
	//Actions Methods
	
	public boolean checkLogoPresence()
	{
		boolean status=driver.findElement(img_logo).isDisplayed();
		return status;
	}
	
	public void setUserName(String name)
	{
		WebElement user=driver.findElement(txt_username);
		user.clear();
		user.sendKeys(name);
	}
	
	public void setUserPassword(String pwd)
	{
		WebElement pass=driver.findElement(txt_password);
		pass.clear();
		pass.sendKeys(pwd);
		
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login).click();
	}

	
}
