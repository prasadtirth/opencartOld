import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
	//	String name="prasad";
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String To Reverse:");
		
		name=sc.nextLine();
		
		int lng=name.length();
		String rev="";
		for(int i=lng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println("Reverse of entered string is:"+rev);
		
		
	}

}
