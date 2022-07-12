package AbstractClass;

public class ContricClass extends AbstractStudy {

	public static void main(String[] args) 
	{
		ContricClass cc= new ContricClass();
		cc.v1();
		cc.v2();
		main();

	}
	protected static void main() 
	{
		ContricClass cc= new ContricClass();
		cc.v3();
	}
	public void v3 ()
	{
		System.out.println("table of Four");
		for(int b=4;b<=40;b=b+4)
		{
			System.out.println(+b);
		}
		
	}
	@Override
	public void v2() {
		// TODO Auto-generated method stub
		System.out.println("now it is complited");
		
	}

}
