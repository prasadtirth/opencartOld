import java.util.Scanner;

public class ThreeDimentionalArrary2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int[][][] a= new int[4][4][4];
        
        System.out.print("Enter Array Elements");
		
		for(int i=0;i<4;i++ )
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
				     //	a[i][j][k]= i+j+k;
					 a[i][j][k]=sc.nextInt();
				
				}				
				
			}
			
			
		}
		
		for(int i=0;i<4;i++ )
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.print("  "+a[i][j][k]);
				}
				
				System.out.println();
			}
			System.out.println();
		}
		

		
		
	}

}
