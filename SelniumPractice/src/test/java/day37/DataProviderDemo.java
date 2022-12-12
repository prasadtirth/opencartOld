package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	
	@Test(dataProvider= "DP")
	void testLogin(String email,String pwd) throws InterruptedException
	{   driver.get("https://demo.nopcommerce.com/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		
		Assert.assertEquals(act_title, exp_title);
		
	}
	
	
	@DataProvider(name="DP")
	String [][] loginData() throws InterruptedException{
		String data[][]=
			{
				{ "paraspachore1234@gmail.com","pass@123"},	
				{ "pavanoltraining@gmail.com", "test123" }, 
				{ "pavanol@gmail.com", "test@123" },
				{ "pavanoltraining@gmail.com", "test3" },
				{ "pavanoltraining@gmail.com", "test@123" },
				{ "pavanoltraining@gmail.com", "test@123" }
			};
		
		return data;
	}
	
	@AfterClass
	void logout()
	{
		driver.quit();
	}
	
	
	
	
	
	

}
