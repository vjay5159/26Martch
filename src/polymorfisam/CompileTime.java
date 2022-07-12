package polymorfisam;

public abstract class CompileTime {

	public static void main(String[] args) 
	{
		//CompileTime ct=new CompileTime();
		A();
		A(10, 20);
		//ct.A(11, 12,13);

	}
	
	public static void A()
	{
		int a=20;
		System.out.println("a="+a);
	}
	public static void A(int a,int b)
	{
		int sum= a+b;
		System.out.println("add = "+sum);
	}
	public abstract void A(int a,int b,int c);
	{
		//int mul=a*b*c;
		//System.out.println("mul= "+mul);
	}

}
