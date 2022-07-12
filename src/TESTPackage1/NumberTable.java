package TESTPackage1;

public class NumberTable {

	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for(int a=1;a<=1;a++)
			{
				System.out.println(i+"  "+a);
				if(i==2&&a==2)
				{
					break;
				}
				System.out.println("   ");
				System.out.println(i+""+a);
				
				for(int b=2;b<=2;b++)
			 {
				if(i==3&&b==3)
				{
					break;
				}
				System.out.println(i+""+b);
				for(int c=3;c<=3;c++)
				{
					if(i==4&&c==4)
					{
						break;
					}
					System.out.println(i+"   "+c);
				}
				}
			}
		}

	}

}
