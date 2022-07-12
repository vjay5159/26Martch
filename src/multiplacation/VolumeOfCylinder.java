package multiplacation;
import java.util.Scanner;

public class VolumeOfCylinder 
{

	public static void main(String[] args)
	{
     EnterValue();
		
	}
	
	public static void EnterValue()
	{
	int r,h;
	float V, pai;
	
	Scanner vk= new Scanner(System.in);
	
	pai= 3.14f;
	
	
	System.out.println("Enter radius of cylinder  = "+ r);
	r= vk.nextInt();
	System.out.println("Enter height of cylindre  = "+ h);
	h= vk.nextInt();
	
	
	
	V= pai*r*r*h;
	
	System.out.println("Volume of cylinger =  "+ V);
	}

}
