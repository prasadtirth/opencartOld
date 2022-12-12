package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='dob']")).click();
        
        
        String year="1999";
        String month="Nov";
        String day="7";
        
        Select drpmon= new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
        drpmon.selectByVisibleText(month);
        
        Select drpyear= new Select (driver.findElement(By.xpath("//select[@aria-label='Select year']")));
        drpyear.selectByVisibleText(year);

        List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
       
        for(WebElement dt:allDates)
        {
        	if(dt.getText().equals(day))
        	{
        		dt.click();
        		break;
        	}
        }
         driver.close();        
        //driver.quit();
       
       
       
       
       
	}

}
