package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {	

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
	
	WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
	   WebDriver driver =new ChromeDriver(option);
	   driver.get("https://testautomationpractice.blogspot.com/");
		
	   driver.manage().window().maximize();
	   
	   Select drpspeed = new Select(driver.findElement(By.xpath("//select[@id='speed']")));

	 //  drpspeed.selectByVisibleText("Faster");
	 //  drpspeed.selectByIndex(2);
	   
	 //Find Number Of Option In DropDown
	   List<WebElement> alloptions = drpspeed.getOptions();
	   
	 //   System.out.println("Total Number Of Dropdown is:"+alloptions.size());
	   
	  //print country list in console
	   
	/*   for(int i=0;i<alloptions.size();i++)
	   {
		System.out.println(alloptions.get(i).getText());   
	   }
	*/
	   for(WebElement opt:alloptions)
	   {
		   System.out.println(opt.getText());
	   }
	   
	   
	}

}
