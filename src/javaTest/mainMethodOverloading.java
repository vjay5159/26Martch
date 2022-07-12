package javaTest;

public class mainMethodOverloading {

public static void main(String[] args)
	{
		 main(10);
		 main();
		int a=10;
		System.out.println(a);
		
     
	}
	protected static void main(int a)
	{
		int b=20;
		System.out.println(b);
	}
	private static void main()
	{
		System.out.println("Main method overloading");
	}


}
