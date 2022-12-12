
package	Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//How To Find Row In A Table
	      int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//System.out.println("Number Of Rows in A Table:"+rows);
		
		//How TO Find No Of Columns in a Table
         int columns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//System.out.println("Number Of Columns in a Table:"+columns);
	
		//How To Retrive row/column Data In A Table
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText();
		System.out.println(value);
		
	
		//How To Retrive all Data From Table
		System.out.println("BookName"+"    "+"Author"+"     "+"Subject"+"      "+"Price");	
	    for(int r=2;r<=rows;r++)
	   {
		   for(int c=1;c<=columns;c++)
		   {
			    value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			    System.out.println(value);
		   }
		   System.out.println();
	   }    
		
		
		driver.quit();
	}

}
