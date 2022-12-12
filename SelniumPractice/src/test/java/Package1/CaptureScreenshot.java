package Package1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	//Screenshot Of Full Page	
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tgt= new File(System.getProperty("user.dir")+"\\screenshots\\home.png");
		FileUtils.copyFile(src, tgt);
		
	//Screenshot From Specific Area Of The Page
		WebElement news=driver.findElement(By.xpath("//div[@class='news-list-homepage']"));
		src=news.getScreenshotAs(OutputType.FILE);
		tgt=new File(System.getProperty("user.dir")+"\\screenshots\\newslist.png");
		FileUtils.copyFile(src, tgt);
		
        driver.quit();
	}

}
