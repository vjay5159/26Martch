package Logical_Program;

public class SpaceCount {

	public static void main(String[] args)
	{
		String a=" P U  N  E ";
		int count=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char Mychar = a.charAt(i);
			if(Mychar==' ')
			{
				count++;
			}
		
		}
		System.out.println("Number of white space in "+a+" is "+count);

	}

}
