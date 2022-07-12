package thisAndSuperClass;

public class SuperUse extends classA
{
	int p=200;
   public static void main(String[] args)
	{
		SuperUse su = new SuperUse();
		su.test1();
	}
	public void test1()
	{    int a,b;
		int p=1;
		System.out.println("local "+p);
		a=12+this.p;
		System.out.println("Globle in same class "+a);
		b=15-super.p;
		System.out.println("Globle in different class "+b);
		
	}

}
