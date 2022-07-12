package multiplacation;
import java.util.Scanner;
public class User_define

{
       public static void main(String args[])
	{
    	
		int A, B, mul;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number A =");
		A = sc.nextInt();
		
		System.out.println("Enter number B =");
		B = sc.nextInt();
		
		mul= mul(A,B);
		
		System.out.println("Multiplaction of two numbers = "+ mul);
		
	}
	     public static int  mul(int A, int B)
	     {
	    	 int mul= A * B;
	    	 
	    	 return mul;
	    	 
	     }
}
