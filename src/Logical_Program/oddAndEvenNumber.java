package Logical_Program;

import java.util.Scanner;

public class oddAndEvenNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Given number is Even number ");
		}
		else
		{
			System.out.println("given number is odd number");
		}
	}

}
