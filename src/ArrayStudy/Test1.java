package ArrayStudy;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args)
	{
	     int money[]=new int[6];
	     
	     money[0]=50;
	     money[1]=20;
	     money[2]=10;
	     money[3]=45;
	     
	     for(int i=0;i<=3;i++)
	     {
	    	 System.out.println(money[i]);
	     }

	     Arrays.sort(money);
	     System.out.println("================");
	     for(int i=0;i<=3;i++)
	     {
	    	 System.out.println(money[i]);
	     }
	}

}
