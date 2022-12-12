package testBase;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	 public WebDriver driver;
	 public Logger logger;//for Logging
	 public ResourceBundle rb;//to read config.properties
	 
	 @BeforeClass
	    @Parameters({"browser"})
	        public void setup( String br) 
	      {
	    	
	    	rb=ResourceBundle.getBundle("config");//Load config.properties
	        logger=LogManager.getLogger(this.getClass());//dynamically get the class name which where is executing the run time
	      
	      }  

}
