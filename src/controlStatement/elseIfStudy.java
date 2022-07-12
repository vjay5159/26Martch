package controlStatement;

public class elseIfStudy {

	public static void main(String[] args)
	{
		int mrk=-900;
		if (mrk>=40 & mrk<=60)
		{
			System.out.println("you are pass");
		}
			else if(mrk>=60 & mrk<68)
			{
				System.out.println("you are in first class");
			}
			else if(mrk>=68 & mrk<100)
			{
				System.out.println("you are in first class with distingsan");
			}
	
	else if(mrk<40 & mrk>0)
	{
		System.out.println("you are fail");
	}
	else
	{
		System.out.println("Invalid input. Please enter number between 0 to 100.");
	}
		
	}
}

