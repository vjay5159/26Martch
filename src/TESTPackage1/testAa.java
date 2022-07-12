package TESTPackage1;

public class testAa {

	public static void main(String[] args)
	{
		int a=14;
		int b=25;
		int bigger,smaller;
		
		if (a>b)
		{
			bigger=a;
			smaller=b;
		}
		else
		{
			bigger=b;
			smaller=a;
		}
		
		for(int i=1;i<bigger;i++)
		{
			if(((bigger*i)%smaller)==0)
			{
				int lcm=bigger*i;
				System.out.println("LCM is "+lcm);
				//break;
			}
		}
		
		testAa sd=new testAa();
		sd.superdigit();

	}
	
	public void superdigit()
	{
		int n=545524,s;
		int d;
		while(n>10)
		{
			//d=n;
			s=0;
			while(n>0)
			{
				s=s+(n%10);
				n=n/10;
			}
			n=s;
		}
		System.out.println(n);
		
	}

}
