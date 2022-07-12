package TESTPackage1;

public class testtable {

	public static void main(String[] args) 
	{
        testtable tt =new testtable();
        tt.A();
        System.out.println();

	}
	public void A()
	{
		int a=12;
		for(a=12;a<=120;a=a+12)
		{
		System.out.println(a);
		}
		int b=13;
		for(b=13;b<=130;b=b+13)
		{
			System.out.println(b+"  "+a);
		}
	}
}