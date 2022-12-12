package Package1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FixDepositCalulator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
				
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/hsbc/fixed-deposit-calculator-ZZZ-BHS001.html");
		driver.manage().window().maximize();
		
	/*	Thread.sleep(2000);
		
		driver.switchTo().alert();
		driver.findElement(By.id("//button[@id='wzrk-cancel'][@class='No thanks']")).click();
	*/	
		
		String file=System.getProperty("user.dir")+"\\testData\\calulator.xlsx";
		
		int row=XLUtils.getRowCount(file, "Sheet1");
		
		//Reading Data From Excel
		for(int i=0;i<row;i++) 
		{
		
		String princ=XLUtils.getCellData(file, "Sheet1", i, 0);
		String rateintrst=XLUtils.getCellData(file, "Sheet1", i, 1);
		String per1=XLUtils.getCellData(file, "Sheet1", i, 2);
		String per2=XLUtils.getCellData(file, "Sheet1", i, 3);
		String freq=XLUtils.getCellData(file, "Sheet1", i, 4);
		String exp_mvalue=XLUtils.getCellData(file, "Sheet1", i, 5);
		
		
		
		//Passing Above Data Into Excel
		
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateintrst);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
		
		Select drpper = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		drpper.selectByVisibleText(per2);
		
		Select drpfrq = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		drpfrq.selectByVisibleText(freq);
		
		driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
		
		String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
		
		// Validation
		
		
		if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
				{
			       System.out.println("Test is Passed");
			       XLUtils.setCellData(file, "Sheet1", i, 7, "Passed");
			       XLUtils.fillGreenColor(file, "Sheet1", i, 7);
				}
	            
		else
		     {
		       System.out.println("Test is Failed");
		       XLUtils.setCellData(file, "Sheet1", i, 7, "Failed");
		       XLUtils.fillGreenColor(file, "Sheet1", i, 7);
			 }
	
		driver.findElement(By.xpath("//img[@class='PL5']")).click();
		Thread.sleep(4000);
			
		
		}
		driver.quit();

	}

}
