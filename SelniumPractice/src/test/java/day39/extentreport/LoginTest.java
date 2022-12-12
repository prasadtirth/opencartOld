package day39.extentreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}
	
	
	
	@Test(priority=1)
	void testLogo()
	{
		boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertEquals(logo, true);
		
	}
	
	
	@Test(priority=2)
	void login()
	{
	   driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc@gmail.com");
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pass123");
	   driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	   
	   //Validation
	   
	   boolean acc=driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
	   Assert.assertEquals(acc, true);
	   
	   
	}

	
	
	//@Test(priority=3)
	void testTitle()
	{
		driver.findElement(By.xpath("nopCommerce demo store"));
	}
	
	
	@Test(priority=4)
	void logOut() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(4000);
		
		boolean status=driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=5)
	void tearDown()
	{
		driver.quit();
	}

}
