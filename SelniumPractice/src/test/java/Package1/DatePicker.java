package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
      //  Apporach 1 Using Sendkeys Method
         
      //  driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/11/1997");//mm/dd/yyyy
		
      //  Approach 2 Using Logic
          
          
        String year = "2019";
        String month="June";
        String date= "27";
        
       
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
       //month and Year
       
       while(true)
       {  
       String mon= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
       String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
       
       if(mon.equals(month) && yr.equals(year))
       {
    	   break;
       }
        
   //  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
        
      driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //Previous
              
	   }
       
      List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));    
      for(WebElement dt:allDates)
      {
    	  if(dt.getText().equals(date))
    	  {
    		  dt.click();
    		  break;
    	  }
      }
	}
}

	