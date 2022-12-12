import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		
		int no=sc.nextInt();
		
		int sum=0;
		
//		int no=123;
		
	
		
		while(no>0)
		{
		   int	temp= no%10;
			sum=sum+temp;
			no=no/10;			
		}
		
		System.out.println(sum);
	}

}
