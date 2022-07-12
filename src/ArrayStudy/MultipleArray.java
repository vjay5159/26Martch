package ArrayStudy;

public class MultipleArray {

	public static void main(String[] args) 
	{
		int ar[][]= {{10,20,30},{15,16,17},{41,42,43}};
		System.out.println(ar[1][1]);
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
