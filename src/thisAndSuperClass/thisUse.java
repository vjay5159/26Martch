package thisAndSuperClass;

public class thisUse {
	int a=20;

	public static void main(String[] args) 
	{
		thisUse tu = new thisUse();
		tu.test();

	}
	public void test()
	{
		int a=30;
		System.out.println("local "+a);
		System.out.println("globle "+this.a);
		
		int add=1+this.a;
		System.out.println("add = "+add);
	}

}
