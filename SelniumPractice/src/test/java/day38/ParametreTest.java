package day38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametreTest {
	
	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeClass
	void setup(String br,String chromeurl)
	{
		if(br.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
			
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get(chromeurl);
	}
	
	@Test(priority=1)
	void testLogo()
	{
	  try{
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Assert.assertEquals(logo.isDisplayed(), true);
	     }
	  catch(Exception e)
	  {
		  Assert.fail();
	  }
	}
	
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
