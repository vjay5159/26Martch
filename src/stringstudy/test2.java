package stringstudy;

public class test2 {

	public static void main(String[] args)
	{
       String a="Manual & Automation Testing";
       String s= new String("Manual & Automation Testing");
       
      int b = a.length();
      
      char upper=0;
      char lower=0;
      System.out.println(b);
      
    for(int i=0;i<=a.length();i++)
    {
    	char ch =a.charAt(i);
    	if(ch>=65 && ch<=90)
    	{
    		System.out.println(upper);
    		upper++;
    		//System.out.println(upper);
    	}
    	//System.out.println(upper);
    }
       
       

	}

}
