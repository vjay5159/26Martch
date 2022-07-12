package loops;

public class RectStarPrint {

	public static void main(String[] args) 
	{
		RectStarPrint rsp = new RectStarPrint();
		rsp.rect();
		System.out.println("========================");
		rsp.upTri();
		System.out.println("========================");
		rsp.downTri();
		System.out.println("========================");
		rsp.equiltri();

	}

	public void rect()
	{
		for(int a=0; a<=5;a++)
		{
		for(int b=0;b<=5;b++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	public void upTri()
	{
		for(int a=0;a<=5;a++)
		{
			for(int b=a;b>=0;b--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void downTri()
	{
		for(int a=5;a>=0;a--)
		{
			for(int b=0;b<=a;b++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public void equiltri()
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=4;b>=a;b--)
			{
			    System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
