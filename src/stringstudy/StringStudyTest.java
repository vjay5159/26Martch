package stringstudy;

public class StringStudyTest {
	
	String name="JavaIsCodingLanguage";

	public static void main(String[] args)
	{
	     StringStudyTest sst=new StringStudyTest();
	     System.out.println("String is = "+sst.name);
	     sst.length();
	     System.out.println("                ");
	     sst.uppercase();
	     System.out.println("                ");
	     sst.lowercase();
	     System.out.println("                ");
	     sst.equalcase();
	     System.out.println("                ");
	     sst. contains();
	     System.out.println("                ");
	     sst.empty();
	     System.out.println("                ");
	     sst.charAt();

	}
	
	public void length()
	{
		System.out.println("Length of String is "+name.length());
	}
	public void uppercase()
	{
		String a = name.toUpperCase();
		System.out.println("Upper Case "+a);
		}
	public void lowercase()
	{
		String b = name.toLowerCase();
		System.out.println("Lower case "+b);
	}
	public void equalcase()
	{
		String a1="Velocity";
		String a2="Velocity";
		String a3 = new String("Velocity");
		String a4= new String("Velocity");
		String a5 =new String("velocity");
		System.out.println(a1==a2);
		System.out.println(a3==a4);
		System.out.println(a1==a4);
		System.out.println(a1==a5);
		System.out.println(a3==a5);
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a5));
		System.out.println(a1.equalsIgnoreCase(a5));
		
	}
	public void contains()
	{
		System.out.println(name.contains("Coding"));
		boolean r = name.contains("dng");
		System.out.println(r);
	}
	public void empty()
	{
		String m="Pune";
		String n="";
		String l=" ";
		String o=null;
		System.out.println(m.length());
		System.out.println(n.length());
		System.out.println(l.length());
	//	System.out.println(o.length());
		System.out.println("-----");
		System.out.println(l.isEmpty());
		
	}
	public void charAt()
	{
		String b="INDIA";
		System.out.println(b.charAt(0));
		System.out.println(b.charAt(1));
		System.out.println(b.charAt(2));
		System.out.println(b.charAt(3));
		System.out.println(b.charAt(4));
		System.out.println(b.charAt(5));
		System.out.println(b.charAt(6));
	}
	

}
