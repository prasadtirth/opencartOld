
public class EvenOddCount {

	public static void main(String[] args) {
		
		int evenCount=0,oddCount=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		
		System.out.println("Even Count is:" +evenCount);
		System.out.println("Odd Count is:" +oddCount);

	}

}
