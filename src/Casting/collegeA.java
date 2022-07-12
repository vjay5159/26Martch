package Casting;

public class collegeA extends college {

	public static void main(String[] args)
	{
		collegeA ca = new collegeA();
		ca.dep();
		ca.div();
		ca.student();
		college cg=new college();
		cg.dep();
		cg.div();
        
		college c= new collegeA();
		c.dep();
		c.div();
		
	}
	public void dep()
	{
		System.out.println("Mechanical department");
	}
	public void div()
	{
		System.out.println(" Divisin A");
	}
	public void student()
	{
		System.out.println("12345");
	}
	
	

}
