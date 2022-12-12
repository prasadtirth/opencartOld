package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutCopy {
	WebDriver driver;
	
	public CheckoutCopy(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")//button[@class='btn btn-default btn-lg']
	WebElement searchbutton;
	
	@FindBy(xpath="//img[@title='iMac']")
	WebElement searchedproduct;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtocart;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']//i[@class='fa fa-shopping-cart']")
	WebElement viewcart;
	
	@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	WebElement shopcart;
	
	@FindBy(xpath="//strong[normalize-space()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//input[@value='register']")
	WebElement registeraccount;
	
	@FindBy(xpath="//input[@value='guest']")
	WebElement guessacc;
	
	@FindBy(xpath="//input[@id='button-account']")
	WebElement continue0;

	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//input[@value='guest']")
	WebElement guesscheckout;
	
	@FindBy(xpath="//h1[normalize-space()='Your order has been placed!']")
	WebElement msgconfm;
	
	@FindBy(xpath="//a[@class='accordion-toggle collapsed']")
	WebElement continue1;
	
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-payment-company']")
	WebElement companyname;
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	WebElement continue2;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	WebElement continue3;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	WebElement continue4;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	WebElement continueodr;
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='input-payment-city']")
	WebElement city; 
	
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//select[@id='input-payment-country']")
	WebElement drp_country;
	
	Select drpcountry= new Select(driver.findElement(By.xpath("//select[@id='input-payment-country']")));
	
	Select drpstate= new Select(driver.findElement(By.xpath("//select[@id='input-payment-zone']")));
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	WebElement billingcontinue;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement afterbillcontinurbtn;

	
	
	
	
	
	
	
	
	
	
	public void clickSearch()
	{
		searchbox.click();
	}
	public void search_txt(String text)
	{
		searchbox.sendKeys(text);
	}
	public void search_btn() 
	{
		searchbutton.click();
	}
	public void searched_product()
	{
		searchedproduct.click();;
	}
	
	public void add_to_cart() 
	{
		addtocart.click();		
	}
	public void view_cart() 
	{
	  viewcart.click();	
		
	}
	public void check_out() 
	{
	  checkout.click();	
		
	}
	public void register_account() 
	{
	  registeraccount.click();	
		
	}
	public void guess_chckout() {
		// TODO Auto-generated method stub
		
	}
	public void button0() {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}
	public void clickLogin() 
	{
		btnLogin.click();		
	}
	public void step2() {
		// TODO Auto-generated method stub
		
	}
	public void first_name(String string) {
		// TODO Auto-generated method stub
		
	}
	public void company_name(String string) {
		// TODO Auto-generated method stub
		
	}
	public void add_ress(String string) {
		// TODO Auto-generated method stub
		
	}
	public void Drp_country() {
		// TODO Auto-generated method stub
		
	}
	public void checkbox_click() {
		// TODO Auto-generated method stub
		
	}
	public void continueorder1() {
		// TODO Auto-generated method stub
		
	}
	 
	
	
	
	
	
	
}
