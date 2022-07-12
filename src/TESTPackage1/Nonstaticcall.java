package TESTPackage1;

public class Nonstaticcall {

	public static void main(String[] args) 
	{
		Nonstaticcall nss= new Nonstaticcall();
		nss.testA();
		NonstaticSstudy nsa= new NonstaticSstudy();
		nsa.testB();

	}
	public void testA()
	{
		System.out.println("Non static method in same class");
	}

}
