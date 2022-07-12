package Generalization;

public class vodaphone implements TRAI {

	@Override
	public void call() {
		System.out.println("1rs/min");
		
	}

	@Override
	public void msg() {
		System.out.println("200msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("5Gb/day");
		
	}
	
	public void newmethod_vodaphone()
	{
		System.out.println(" Vodaphone new method");
	}
	
	

}
