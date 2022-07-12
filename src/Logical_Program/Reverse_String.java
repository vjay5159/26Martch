package Logical_Program;

public class Reverse_String {

	public static void main(String[] args)
	{
		String s1 = "VijayKokate";
        String rev=" ";
       String rm;
        for(int i=s1.length()-1;i>=0;i--)
        {
        	rev=rev+s1.charAt(i);
        }
        System.out.print(rev);
}
}
