package Package1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCookies {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// How To Capture Cookies From Browser
		Set<Cookie>cookies=driver.manage().getCookies();
		System.out.println("Size Of Cookies:"+cookies.size());

		//How To Print Cookies Name From Browser
		for(Cookie ck:cookies)
		{
			System.out.println(ck.getName()+"      "+ck.getValue());
		}
		
		//How Add Cookie To The Browser
		Cookie cookieobj = new Cookie("Fist cookie","123123");
		driver.manage().addCookie(cookieobj);
		
		cookies= driver.manage().getCookies();
		System.out.println("Size Of Cookies After Adding New Cookies:"+cookies.size());
		
		//How To Delete Specific Cookie		
		driver.manage().deleteCookieNamed(".Nop.Culture");
		cookies = driver.manage().getCookies();
		System.out.println("Size Of Cookie After Deleting Specific Cookie:"+cookies.size());
		
		//How To Delete All Cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size Of Cookies After Deleting All:"+cookies.size());
		
		driver.quit();
	}
              
}
