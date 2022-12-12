
public class SwapNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		System.out.println("Before Swapping The Number:");
		
		int a=10;
		int b=20;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping The Number:");
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}

}
