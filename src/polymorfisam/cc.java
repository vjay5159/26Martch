package polymorfisam;

public class cc extends CompileTime {

	public static void main(String[] args)
	{
		cc c=new cc();
		CompileTime.A();
		CompileTime.A(10, 20);
		c.A(10, 20, 30);

	}

	@Override
	public void A(int a, int b, int c) 
	{
		int mul=a*b*c;
		System.out.println("Mul = "+mul);
		
	}

}
