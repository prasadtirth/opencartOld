import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String original,rev="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String To Check The Palindrome Or Not: ");
		
		original=sc.nextLine();
		
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		
		if(original.equals(rev))
		{
			System.out.println("Entered String is Palinrome");
		}
		else
		{
			System.out.println("Entered String is Not a Palindrome");
		}
		
		
	}

}
