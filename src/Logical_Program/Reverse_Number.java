package Logical_Program;

public class Reverse_Number {

	public static void main(String[] args)
	{
		int orgNo=5159;
		int rem;
		int rev=0;
	  while(orgNo!=0)
	  {
		  rem=orgNo%10;
		  rev=rev*10+rem;
		  orgNo=orgNo/10;
	  }
	  System.out.println(rev);

	}

}
