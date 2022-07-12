package typesOfVariables;

public class StudyVariableNonStatic
{
	String name="M S Dhoni";
	int a=4876;
	int b=128;
	int d=2134;
    float c;
    int e;
    
	public static void main(String[] args) 
	{
		StudyVariableNonStatic svns= new StudyVariableNonStatic();
		svns.formula();
		
		System.out.println("Player Name       :  "+svns.name);
		System.out.println("Batting Average   :  "+svns.c);
		System.out.println(+svns.e);

	}
	public void formula()
	{
	//float c;
	c=a/b;
	e=a*b;
	}
	

}
