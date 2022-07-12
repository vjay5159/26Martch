package Generalization;

public class testgeneralisation {

	public static void main(String[] args)
	{
		Airtel a=new Airtel();
		a.call();
		a.data();
		a.msg();
		a.Newmethod_Airtel();
		
		System.out.println("--------------");
		
		vodaphone v =new vodaphone();
		v.call();
		v.data();
		v.msg();
		v.newmethod_vodaphone();

	}

}
