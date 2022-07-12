package TESTPackage1;

import java.awt.geom.Arc2D.Float;

public class StudentInformation {

	public static void main(String[] args) 
	{
		StudentInformation si= new StudentInformation();
		si.details("Vijay Kokate","Murud",'M','B',7770034214L,26);
		si.details("sachin", "pune", 'M', 'A', 9545644803L, 28);
		

	}
	
	public void details(String name, String add,char gen,char bg,long con,int i)
	{
		System.out.println("=== Student Information ===");
		
		System.out.println(" Name        : "+name);
		System.out.println(" city        : "+add);
		System.out.println(" Gender      : "+gen);
		System.out.println(" Blood Group : "+bg);
		System.out.println(" Contact No. : "+con);
		System.out.println(" Age         : "+i);
		
		System.out.println("===========================");
		
	}

}
