package Package1;

import java.io.FileInputStream ;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
    */		
		
		//Approach 1 Reading Properties File
		
	/*	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		
		Properties pro = new Properties();
		pro.load(file);
		
		String url=pro.getProperty("url");
		String email=pro.getProperty("useremail");
		String password=pro.getProperty("userpassword");
  */
		//Approach 2 Reading Properties File
		
		ResourceBundle rb = ResourceBundle.getBundle("config"); //only Name Of The Properties File
		String url=rb.getString("url");
		String email=rb.getString("useremail");
		String password=rb.getString("userpassword");     
		
	    driver.get(url);
	    driver.manage().window().maximize();
	    
	    WebElement emailtext=driver.findElement(By.xpath("//input[@id='Email']"));
		emailtext.clear();
		emailtext.sendKeys(email);
		
		WebElement passtext=driver.findElement(By.xpath("//input[@id='Password']"));
		passtext.clear();
		passtext.sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.quit();
		
		
	}

}
