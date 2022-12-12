package day37;

import org.testng.annotations.*;

/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity

signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression

paymentinrupees - sanity & regression
paymentindollar - sanity  
paymentReturnbyBank  - regression
*/

public class Grouping {
	
	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("This is Login By Email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("This os Login By FaceBook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is Login By Twitter");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void signupByEmail()
	{
		System.out.println("This is signup By Email");
	}
	
	@Test(priority=5,groups= {"regression"})
	void signupByFacebook()
	{
		System.out.println("This is Signup BY Facebook");
	}
	
	@Test(priority=6,groups="regression")
	void signupTwitter()
	{
		System.out.println("This is Signup By Twitter");
	}

	@Test(priority=7,groups= {"sanity","regression"})
	void paymentInRupees()
	{
		System.out.println("This is Payment In Rupees");
	}
	
	@Test(priority=8,groups= {"sanity"})
	void paymentInDoller()
	{
		System.out.println("This is Payment in Doller");
	}
	
	@Test(priority=9,groups= {"regression"})
	void paymentReturnByBank()
	{
		System.out.println("This is Payment Return BY Bank");
	}
	
}
