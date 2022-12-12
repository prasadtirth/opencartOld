package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
	 WebDriver driver= new ChromeDriver();
	 
	// ChromeDriver driver = new ChromeDriver(); 
	 
	 driver.get("http://poshanabhiyaan.gov.in/#/login");
	
	 driver.manage().window().maximize();
	 
	 LoginPage lp = new LoginPage(driver);
	 
	 lp.user_name("mow&cd-2753004");
	 Thread.sleep(3000);
	 
	 lp.pass_word("mow&cd-2753004");
	 Thread.sleep(5000);
	 
	 lp.sign_in();
	 Thread.sleep(3000);
	 
	 driver.switchTo().alert().accept();
	 
	 
	 
	 
	 
	 

	}

}
