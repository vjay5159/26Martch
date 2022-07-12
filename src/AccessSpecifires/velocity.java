package AccessSpecifires;

public class velocity {

	public static void main(String[] args)
	{
	velocity v=new velocity();
	v.test1();
	v.test2();
	v.test3();
	v.test4();

	}
	private void test1()
	{
		System.out.println("private");
	}
	void test2()
	{
		System.out.println("Default");
	}
	protected void test3()
	{
		System.out.println("Protected");
	}
	public void test4()
	{
		System.out.println("public");
	}

}
