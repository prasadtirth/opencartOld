package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutSelect {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		List<WebElement>alloptions = driver.findElements(By.xpath("//select[@id='input-country']/option"));
		
		System.out.println("Total Number of Option in DropDown:"+alloptions.size());
		
	/*	for(WebElement option: alloptions)
		{
			System.out.println(option.getText());
		}
	*/	
		driver.quit();
	}

}
