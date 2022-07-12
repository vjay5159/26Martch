package controlStatement;

public class conditionConstructor 
{     int a=1324653;
     static String usernm;
      

	public static void main(String[] args)
	{
		conditionConstructor cc =new conditionConstructor();
		cc.info();

	}
	public void info()
	{    
		System.out.println("Number is "+a
				);
		if(a%2==0)
		{
			System.out.println("it is even");
		}
		
		else
		{
			System.out.println("it is odd");
		}
	
		}
		
	}

