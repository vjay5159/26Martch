package loops;

public class Evennumbers
{
	public static void main(String[] args) 
	{
		int r,a,sum=0;
		for( a=1;a<=10;a=a+2)
		{
			System.out.println(a);
			r=a%10;
			sum=sum+r;
			a=a/10;
			System.out.println("sum = "+sum);
		}
		
	}
	
	
	

}
