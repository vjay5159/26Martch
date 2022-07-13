package Logical_Program;


public class FindMaxValueOfArray {

	public static void main(String[] args)
	{
	    String a[]= {"latur","pune","mumbai"};
	     int max=0;
	     String largeString="";
	    
	   System.out.println(a[0]);
	   System.out.println(a[1]);
	   System.out.println(a[2]);
	   System.out.println("=====================");
	    
	   for(String s:a)
	    {
	    	if(s.length()>max)
	    	{
	    		max=s.length();
	    		largeString=s;
	    	}
	    }
	   System.out.println(largeString);
	}

}
