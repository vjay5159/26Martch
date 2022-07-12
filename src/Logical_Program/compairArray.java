package Logical_Program;

import java.util.Arrays;

public class compairArray {

	public static void main(String[] args)
	{
		int ar1[]= {10,20,30};
		int ar2[]= {40,90,30};
        int ar3[]= {10,20,50};
        
        System.out.println(Arrays.equals(ar1,ar2));
        System.out.println(Arrays.equals(ar1,ar3));
        System.out.println(Arrays.equals(ar2,ar3));
       
        
	}

}
