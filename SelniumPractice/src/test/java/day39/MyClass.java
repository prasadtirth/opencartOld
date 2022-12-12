package day39;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


 //@Listeners(day39.MyListeners.class)
public class MyClass {
	
	@Test(priority=1)
	void test1()
	{
		Assert.assertEquals("ab", "ab");
	}

	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals("ab", "cd");
	}
	
	@Test(priority=3,dependsOnMethods= {"test2"})
	void test3()
	{
		Assert.assertEquals("abc", "abc");
	}
}
