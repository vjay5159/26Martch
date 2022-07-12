package Logical_Program;

public class ReverseNumbers {

	public static void main(String[] args)
	{
		int orgN=85476;
		int rem;
	    int rv=0;
		while(orgN!=0)
		{
		   rem=orgN%10;
		   rv=rv*10+rem;
		   
		   orgN=orgN/10;
		   
		}
		System.out.println(rv);
	}

}
