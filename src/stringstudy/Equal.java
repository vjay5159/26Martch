package stringstudy;

public class Equal {

	public static void main(String[] args) 
	{
		String s="AUTOMOTION";
		String s1="vijkokate";
		String s2="vijay";
	
		String s3=new String("vijay");
		
		System.out.println(s1.equals(s));
		System.out.println(s1.equalsIgnoreCase(s));
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s.concat(" "+s2+" ").concat(s1));
		
		System.out.println(s.substring(4));
        System.out.println(s.substring(2,6));
        
        System.out.println(s1.split("k"));
	}

}
