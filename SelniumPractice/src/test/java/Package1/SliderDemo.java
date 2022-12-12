package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location Of Min Slider:"+min_slider.getLocation());		
		act.dragAndDropBy(min_slider, 150, 0).perform();
		System.out.println("Location Of Min Slider After MOving"+min_slider.getLocation());
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location Of Max Slider:"+max_slider.getLocation());
		act.dragAndDropBy(max_slider, -144, 0).perform();
		System.out.println("Location Of Max Slider After Moving:"+max_slider.getLocation());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
