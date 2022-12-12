package sampleproject;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	//	WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		
	}

}
