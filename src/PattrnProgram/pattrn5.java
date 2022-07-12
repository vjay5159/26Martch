package PattrnProgram;

public class pattrn5 {

	public static void main(String[] args)
	{

		   for(int i=0;i<=5;i++)
		   {
			   for(int j=i;j>=0;j--)
			   {
				   System.out.print(" ");
			   }
			   for(int k=5;k>=i;k--)
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
		   
		   System.out.println("=======================");

		   int star=0;
		   int space=0;
		   for(int i=1;i<=6;i++)
		   {
		   for(int j=1;j<=space;j++)
		   {
		   System.out.print(" ");
		   }
		   for(int j=1;j<=star;j++)
		   {
		   System.out.print("*");
		   }
		   System.out.println();
		   star++;
		   space++;
		   }

	}

}
