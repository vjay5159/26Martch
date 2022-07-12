package javaTest;

public class constructore
{
	public constructore()
	{
	
	  int a=20;
	 
	  System.out.println(a);
	}
	public constructore(int a)
	{   this();
		int b=10;
	
		System.out.println(b);
	}

	public static void main(String[] args)
	{
	   constructore con =new constructore(1);
	   
	}

}
