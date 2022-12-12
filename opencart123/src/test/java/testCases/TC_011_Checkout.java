package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.CheckoutCopy;
import pageObject.HomePage;
import testBase.BaseClass;

@Test
public class TC_011_Checkout extends BaseClass {
	
	public void test_Checkout() throws InterruptedException {
		
		logger.info("Starting TC_011_Checkout");
	try
	{	
		driver.get(rb.getString("appURL"));
			 
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    HomePage hp = new HomePage(driver);
	    
	    CheckoutCopy coc= new CheckoutCopy(driver);	    
	  	   
	    coc.search_txt("iMac");
	    Thread.sleep(2000);
	    logger.info("Enter Any Product");
	    Thread.sleep(1000);	
	                                                      
	    coc.search_btn();
	    logger.info("Clicked OnThe Search Button Icon");
	    Thread.sleep(1000);	    
	

        coc.searched_product();
	    logger.info("clicked On The Searched Product");
	    Thread.sleep(1000);
	    
	    coc.add_to_cart();
	    logger.info("Cliked on the Add to Cart");
	    Thread.sleep(1000);
	    
	    coc.view_cart();
	    logger.info("Clicked on the View Cart");
	    Thread.sleep(1000);
	    
	    coc.check_out();
	    logger.info("Clicked On The Checkout");
	    Thread.sleep(1000);
	   
	    coc.register_account();
	    logger.info("Clicked On The Register Account");
	    Thread.sleep(1000);
	
	    coc.setEmail("prasadtirth9006@gmail.com");
//	    coc.setEmail(randomestring1()+"@gmail.com");
	    logger.info("Provied Email");
	    Thread.sleep(1000);
	    
	    coc.setPassword("test1234");
	    logger.info("Provided Password");
	    Thread.sleep(1000);
		       
	    coc.clickLogin();
	    logger.info("Clicked On The Login");
	    Thread.sleep(1000);
	    
	    
	}	
	catch(Exception e)
	{
		logger.fatal("Checkout Failed ");
		Assert.fail();
	}
	
	logger.info(" Finished TC_011_Checkout ");
	
}
}	