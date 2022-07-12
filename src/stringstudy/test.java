package stringstudy;

public class test {

	public static void main(String[] args)
	{
		String s="WelCome To % AutomatioN";
		int lower= 0;
		int upper= 0;
		System.out.println("Length = "+s.length());
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			
		       if(ch>=65 && ch<=90)
		       {
		    	   upper++;
		    	   
		    	   
		       }
		       
		       else if(ch>=97 && ch<=122)
		       {
		    	   lower++;
		       }
		       
		     
		}
		System.out.println("Lower = "+lower);
		System.out.println("Upper = "+upper);
		
		//v1();

	}
/*	public static void v1()
	{
		char a;
		int b;
		for(b=0;b<=255;b++)
		{
			System.out.print(b);
			System.out.println((char)b+" = "+b);
		}*/
	}

//}
