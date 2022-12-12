import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x=10,y=20;
		int z;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();   
		
		System.out.println("Before Swapping\n x="+x+"\n y="+y);
		
		z=x; x=y; y=z;
		
		System.out.println("After Swapping\n x=" +x+ "\n y="+y);		

	}

}
