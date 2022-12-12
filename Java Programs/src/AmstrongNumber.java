import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		
		int no=sc.nextInt();
		
		int a,i=0,j=0;
		
		a=no;
		
		while(a>0)
		{
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		
		if(no==j)
		{
			System.out.println("It is Amstrong Number");
		}
		
		else
		{
		   System.out.println("It is Not A Amstrong Number");	
		}
		
	}

}
