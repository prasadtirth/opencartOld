package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32(2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");

	}

}
