

public class ThreeDimentionalArray {

	public static void main(String[] args) {
		
		int[][][] a= new int[6][6][6];
		
		for(int i=0;i<6;i++ )
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					a[i][j][k]= i+j+k;
				}				
				
			}
			
			
		}
		
		for(int i=0;i<6;i++ )
		{
			for(int j=0;j<6;j++)
			{
				for(int k=0;k<6;k++)
				{
					System.out.print(" " +a [i][j][k]);
				}
				
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

	}

