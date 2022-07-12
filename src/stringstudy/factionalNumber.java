package stringstudy;

public class factionalNumber {

	public static void main(String[] args) 
	{
		int b,mul=1;
		for(int a=1;a<=5;a++)
		{
			b=a%10;
		   mul=mul*b;
			
		}
		System.out.println(mul);
		
		factionalNumber s=new factionalNumber();
		s.s1();

	}
	public void s1()
	{
		for(int c=65;c<=90;c++)
		{
			
			System.out.println((char)c);
		}
		for(int d=97;d<=122;d++)
		{
			System.out.println((char)d);
		}
	}

}
