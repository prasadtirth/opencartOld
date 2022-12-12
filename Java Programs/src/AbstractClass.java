

public class AbstractClass {

	public static void main(String[] args) {
	//	car c = new car();
  	//	c.start();
		
		scotter sc = new scotter();
		sc.start();
		
	}
	
}	
		
		abstract class vehicle
		{
			abstract void start();
		}
		
		class car extends vehicle
		{
			void start()
			{
				System.out.println("car start with key");
			}
		}
		class scotter extends vehicle
		{
			void start()
			{
				System.out.println("scottr start with kick");
			}
		}
	
