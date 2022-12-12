package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement username;
			
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='signin']")
	WebElement signin;

}
