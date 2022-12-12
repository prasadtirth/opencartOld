
public class SumOfEvenOddNumber {

	public static void main(String[] args) {
		
	int oddCount=0,evenCount=0;
	
	for(int i=1;i<=100;i++)
	{
		if(i%2==1)
		{
			oddCount=oddCount+i;
		}
		else
		{
			evenCount=evenCount+i;
		}
	}
	
	System.out.println("count of oddnumber is:"+oddCount);
	System.out.println("count of evennumber is:"+evenCount);

	}

}
