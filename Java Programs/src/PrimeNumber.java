import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		
		int no=sc.nextInt();
		
	//	int no=7;
		boolean prime=true;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
			  prime=false;
			  break;
			}
		}
		
		System.out.println(prime);
		
	}

}
