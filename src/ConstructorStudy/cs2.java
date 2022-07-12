package ConstructorStudy;

public class cs2

{
		String city="Pune";
		String name;
		
		public cs2()
		{
			name="Velocity";
		}
		
	
	public static void main(String[] args) 
	{

		cs2 c2=new cs2();
		c2.display1();
		
	}
	public void display1()
	{
	
		System.out.println("My city name is = "+city);
		System.out.println("My name is = "+name);

	}

}
