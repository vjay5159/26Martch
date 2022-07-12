package Logical_Program;

public class ReverseString {

	public static void main(String[] args)
	{
		String org="Vijay";
		String rev=" ";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
			
		}
		System.out.print(rev);
		

	}

}
