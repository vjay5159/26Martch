package AbstractClass;

public class testcca extends testa {

	public static void main(String[] args) 
	{
	    testcca cca = new testcca();
	    cca.b();
	   testa ta = new testcca();
	   ta.a();
	    

	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("Now it is complited");
	}

}
