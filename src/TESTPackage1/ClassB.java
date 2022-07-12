package TESTPackage1;

public class ClassB extends ClassA
{

	int a=20;
	void show (int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args)
	{
		ClassB b =new ClassB();
		b.show(30);

	}

}
