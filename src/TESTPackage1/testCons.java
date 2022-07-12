package TESTPackage1;

public class testCons extends testCons1
{
	int a=10,b=20,c=30;
	testCons()
	{
		System.out.println("Default");
	}
	private testCons(int a)
	{
		c=this.a-this.b-this.c;
		System.out.println("Private "+c);
	}
	public testCons(int a, int b)
	{
		int d;
		d=this.a+this.b+this.c;
		System.out.println("Public "+d);
	}
	protected testCons(int a, int b,int c )
	{
		b=this.a*this.b*this.c;
		System.out.println("Protected "+b);
	}

	public static void main(String[] args)
	{
		testCons tc =new testCons();
		testCons tc1 =new testCons(10);
		testCons tc3 = new testCons(10,20);
		testCons tc4 = new testCons(10,20,30);
		testCons tcs1 = new testCons();
		tcs1.testa();
	}
	public void testa()
	{
		float d;
		d=super.a*super.b*super.c;
		System.out.println("Another class "+d);
	}

}
