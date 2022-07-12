package TESTPackage1;

public class NumberPattern 
{
   public static void main(String[] args)
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=4;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
