package javaTest;

abstract class interFerance {
	 int a=10;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	public void inter()
	{
		int a=20;
        System.out.println(a+this.a);
	}
	public abstract void s();

}
