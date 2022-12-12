package Package2TestNG;

import org.apache.xmlbeans.soap.SOAPArrayType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@Test(priority=1)
	void openapp()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	void login()
	{
		WebElement emailtxt=driver.findElement(By.xpath("//input[@id='Email']"));
		emailtxt.clear();
		emailtxt.sendKeys("admin@yourstore.com");
		
		WebElement passtxt=driver.findElement(By.xpath("//input[@id='Password']"));
		passtxt.clear();
		passtxt.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String act_text=driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		
  		if(act_text.equals("Dashboard"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
			
		
		//Assert.assertEquals(act_text, "Dashboard123");
	}	
	
	@Test(priority=3)
	void close()
	{
		driver.close();
	}

}
