
public class ThisDemo {
	
	void m1(ThisDemo td)
	{
		System.out.println("i am in m1 Method");
	}
	
	void m2()
	{
		m1(this);
	}

	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		td.m2();
		

	}

}
