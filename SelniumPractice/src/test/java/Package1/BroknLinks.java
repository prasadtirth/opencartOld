package Package1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/*
step1 : capture all the links
step2 : capture href attribute values of all the links
step3 : if href attribute doesnot have value--ignore it
step4 : if href attribute have value then conenct to the server usin the value(url)
step5: if error code <400  not a broken link  / if error code >=400 broken link
 */


public class BroknLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement element:links)
		{
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is Empty");
				continue;
			}
			
			
			URL link= new URL(url);     //Convert The String url to URL Object
			
			try {
			HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
			httpconn.connect();     //Connect to Server
			
			if(httpconn.getResponseCode()>=400)
			{
				System.out.println(httpconn.getResponseCode()+"     "+url+"     "+"Broken Link");
			}
			
			else
			{
				System.out.println(httpconn.getResponseCode()+"     "+url+"     "+"Not Broken Link");
			}
			}
			catch(Exception e)
			{
				
			}	
			
		}		
		driver.quit();	

	}

}
