import java.util.Scanner;

public class MultiplicationOfNumbers {

	public static void main(String[] args) {
		
		int n,j;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Table:");
		n=sc.nextInt();
		
		System.out.println("Table Upto:");
		j=sc.nextInt();
		
		for(int i=1;i<=j;i++)
		{
			int c= n*i;
			
			System.out.println(c);
		}		
		
	}

}
