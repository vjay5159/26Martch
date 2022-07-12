package loops;

public class numberaddition {

	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=1;j++)
			{
				if(i==2&&j==2)
				{
					break;
				}
				System.out.println("  ");
				System.out.println(i+""+j);
			
				for(int k=2;k<=2;k++)
				{
					if(i==3&&k==3)
					{
						break;
					}
					System.out.println( i+""+k);
				}
				for(int k=3;k<=3;k++)
				{
					if(i==4&&k==4)
					{
						break;
					}
					System.out.println( i+""+k);
				}
				for(int k=4;k<=4;k++)
				{
					if(i==5&&k==5)
					{
						break;
					}
					System.out.println( i+""+k);
				}
				for(int k=5;k<=5;k++)
				{
					if(i==6&&k==6)
					{
						break;
					}
					System.out.println( i+""+k);
				}
			}
		}
	
}
}
