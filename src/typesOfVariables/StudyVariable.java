package typesOfVariables;

public class StudyVariable
{
	static int a=10;

	public static void main(String[] args) 
	{
       StudyVariable sv = new StudyVariable();
       sv.Display();
       System.out.println("The value of a is "+a+" and p is "+StudyVariable1.p);
      // System.out.println("The value of p is "+StudyVariable1.p);

	}
	public void Display()
	{
		int b=30;
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}

}
