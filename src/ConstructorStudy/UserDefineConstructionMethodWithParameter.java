package ConstructorStudy;

public class UserDefineConstructionMethodWithParameter 
{     
	int a;
	int b;
	int c;
     
	public UserDefineConstructionMethodWithParameter()
	{
		 a = 12;
		 b = 13;
		 c = 14;
	}
	public UserDefineConstructionMethodWithParameter(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args) 
	{
		UserDefineConstructionMethodWithParameter udcwp = new UserDefineConstructionMethodWithParameter();
        udcwp.Addition();
        UserDefineConstructionMethodWithParameter udcwp1 = new UserDefineConstructionMethodWithParameter(10, 0, 0);
        udcwp1.Addition();
        UserDefineConstructionMethodWithParameter udcwp2 = new UserDefineConstructionMethodWithParameter(10,20,0);
        udcwp2.Addition();
        
        UserDefineConstructionMethodWithParameter udcwp3 = new UserDefineConstructionMethodWithParameter(10,20,30);
        udcwp3.Addition();
	}
	public  void Addition()
	{
		int a=100;int b=200; int c=300;
		int sum= this.a+this.b+this.c;
		System.out.println("Addition = "+sum);
	}

}
