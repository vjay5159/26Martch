package Logical_Program;

public class FindMaxIntValue {

	public static void main(String[] args)
	{
		int a[]= {50,20,60,10,5,80};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		
		}
		System.out.println( "Large int value is "+max);
		
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
        	if(a[i]<min)
        	{
        		min=a[i];
        	}
        }
        System.out.println("Small int value is "+min);
	}

}
