package interfaceStudy;

public class intclass implements interfaceClass {

	int a=20;
	int b=10;
	public static void main(String[] args)
	{
		intclass it = new intclass();
		it.v1();
		it.v1(50);

	}

	@Override
	public void v1() {
		int a=20;
	          System.out.println(" Value of golble a is "+this.a);
	          System.out.println(" Value of local a is "+a);
	}

	@Override
	public void v1(int b) {
	
		System.out.println(" Value of golble b is "+this.b);
		System.out.println(" Value of local b is "+b);	
	}

}
