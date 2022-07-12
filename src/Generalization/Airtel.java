package Generalization;

public class Airtel implements TRAI
{

	@Override
	public void call() {
		System.out.println("0.5rs/min");
		
	}

	@Override
	public void msg() {
		System.out.println("150sg/day");
		
	}

	@Override
	public void data() {
		System.out.println("1.5GB/day");
		
	}
	public void Newmethod_Airtel()
	{
		System.out.println("Airtel new method");
	}
	

}
