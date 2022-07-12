package SUM_OF_NUMBERS;
import java.util.Scanner;

public class While_loop 
{

	public static void main(String[] args) 
	{
int n,r,sum=0;

System.out.print("Enter number  ");
Scanner ref=new Scanner(System.in);
n=ref.nextInt();

while(n>0) 
{
	r=n%10;
	sum=sum+r;
	n=n/10;
}
System.out.print("sum of digits  "+ sum);

	}

}
