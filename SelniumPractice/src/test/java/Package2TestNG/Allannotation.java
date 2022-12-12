package Package2TestNG;

import org.testng.annotations.*;

public class Allannotation {

	@Test
	void bs()
	{
		System.out.println("This is Before Suite");
	}
	
	@Test
	void as()
	{
		System.out.println("This is After Suite");
	}
	
	@Test
	void bt()
	{
		System.out.println("This is Before Test");
	}
	
	@Test
	void at()
	{
		System.out.println("This is After Test");
	}
	
	@Test
	void bc()
	{
		System.out.println("This is Before Class");
	}
	
	@Test
	void ac()
	{
		System.out.println("This is After Class");
	}
	
	@Test
	void bm()
	{
		System.out.println("This is Before Method");
	}
	
	@Test
	void am()
	{
		System.out.println("This is After Method");
	}

	@Test(priority=1)
	void tm1()
	{
		System.out.println("This is Method 1");
	}
	
	@Test(priority=2)
	void tm2()
	{
		System.out.println("This is method 2");
	}
	

}
