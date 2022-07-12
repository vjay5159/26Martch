package ConstructorStudy;
public class UDConstructor
{
	float a;
	float b;
	
	public UDConstructor()
	{
		a=100f;
		b=200f;
		
	}
	public static void main(String[]args)
	{
		UDConstructor udc= new UDConstructor();
		udc.add();
		udc.sub();
		udc.mul();
		udc.div();
        
	}
	public void add()
	{
		float sum=a+b;
		System.out.println("sum is = "+sum);
	}
	public void sub()
	{
		float sub=a-b;
		System.out.println("subtraction is = "+sub);
		
	}
    public void mul()
    {
    	float mul=a*b;
    	System.out.println("multipation is = "+mul);
    }
    public void div()
    {
    	float div=a/b;
    	System.out.println("division is = "+div);
    }
}
