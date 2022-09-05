package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewsLetter {
	
	WebDriver driver;
	
	public NewsLetter(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);	
	}
	
	

	@FindBy(xpath="//a[normalize-space()='Subscribe / unsubscribe to newsletter']")
	WebElement newslett;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement conbtn;
	
	@FindBy(xpath="//*[@id=\"account-account\"]/div[1]/text()")
	WebElement msgconfrm;
	
	public void newsletter()
	{
		newslett.click();
	}
	
	public void continue_btn()
	{
		conbtn.click();
	}
	
	public String getConfirmationMsg()
    {
  	  try
  	  {
  		  return (msgconfrm.getText());
  	  }
  	  catch(Exception e)
  	  {
  		  return(e.getMessage());
  			  
  	  }
    }
}	
	

