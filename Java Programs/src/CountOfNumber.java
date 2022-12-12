import java.util.Scanner;

public class CountOfNumber {

	public static void main(String[] args) {
		
		int no,i=0;

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		no= sc.nextInt();
		while(no>0)
		{
			no=no/10;
			i++;
		}
		
		System.out.println("No of digit Present:"+i);
		
	}
	
	

}
