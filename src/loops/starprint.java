package loops;

public class starprint {

	public static void main(String[] args) 
	{
		starprint s=new starprint();
		s.n1();
		System.out.println("---------");
		s.n2();
		System.out.println("----------");
		s.n3();
		System.out.println("----------");
		s.n4();
		System.out.println("-----------");
		s.n5();

	}
	public void n5()
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	public void n4()
	{
		for(int a=5;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	public void n3()
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
	public void n2()
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(a+" ");
				
			}
			System.out.println();
		
		}
		System.out.println("            ");
		for(int c=5;c>=1;c--)
		{
			for(int d=1;d<=c;d++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	public void n1()
	{
		for(int a=5;a>=1;a--)
		{
		for(int b=5;b>=a;b--)
		{
			System.out.print(a+" ");
	    }
		
		
		System.out.println();
		}
		for(int c=2;c<=5;c++)
		{
			for(int d=c;d<=5;d++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
	}
	
	
}
}
