package string;

public class StringStudy {

	public static void main(String[] args) 
	{
		StringStudy ss=new StringStudy();
		ss.s1();
		System.out.println("----------------------------------");
		ss.s2();
		System.out.println("----------------------------------");
		ss.s3();
		System.out.println("----------------------------------");
		ss.s4();
		System.out.println("----------------------------------");
		ss.s5();
		System.out.println("----------------------------------");
		ss.s6();
		System.out.println("----------------------------------");
		ss.s7();
		System.out.println("----------------------------------");
		ss.s8();
		System.out.println("----------------------------------");
		ss.s9();
		System.out.println("----------------------------------");
		ss.s10();
	}

      String b="VijayKokate";
	
	public void s1()
	{
		String s="StringStudy";
		int a = s.length();
		
	    System.out.println("Length of string = "+a);
	}
	
	void s2()
	{
		String b="AjayKokate";
		System.out.println(" String local= "+b);
		System.out.println(" String globle= "+this.b);
		String c = b.toLowerCase();
		String d = this.b.toUpperCase();
		
		System.out.println(" Lower case = "+c);
		System.out.println(" Upper case = "+d);
	}
	
	protected void s3()
	{
		String x="Vijay";
		String x1="vijay";
		String x2="vijay";
		String x3=new String("Vijay");
		String x4=new String("vijay");
		String x5=new String("vijay");
		System.out.println(x==x2);
		System.out.println(x1==x2);
		System.out.println(x==x3);
		System.out.println(x==x4);
		System.out.println(x3==x4);
		System.out.println(x4==x5);
		System.out.println("                       ");
		System.out.println(x.equals(x1));
		System.out.println(x1.equals(x2));
		System.out.println(x.equals(x3));
		System.out.println(x1.equals(x3));
		System.out.println(x3.equals(x4));
		System.out.println(x4.equals(x5));
		
		
	}

	private void s4()
	{
		String a="Vijay";
		System.out.println(a.contains("ij"));
		System.out.println(a.contains("Vj"));
		boolean b=a.contains("ja");
		System.out.println(b);
	}

	void s5()
	{
		String a="Vijay";
		String b="";
		String c="  ";
		String d="2";
		String e="%";
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(c.isEmpty());
		System.out.println(e.isEmpty());
		//System.out.println(d.isEmpty());
		System.out.println("                ");
		//System.out.println(a.isBlank());
		//System.out.println(b.isBlank());
		//System.out.println(c.isBlank());
	}

	public void s6()
	{
		String a="Vijay";
		System.out.println(a.charAt(0));

		char re =a.charAt(3);
		System.out.println(re);
	}
 
protected void s7()
{
	String a="velocity";
	System.out.println(a.endsWith("city"));
}

public void s8()
{
	String b= new String("Vijay");
	boolean s = b.startsWith("vi");
	System.out.println(b.startsWith(b));
	System.out.println(b.startsWith("ija",1));
}
void s9()
{
	String a="vijay bharat kokate";
	System.out.println(a.substring(3));
	System.out.println(a.substring(3, 10));
}
void s10()
{
	String a="Vijay";
	String b="Bharat";
	String c="Kokate";
	System.out.println(a.concat(" ").concat(b).concat(" ").concat(c));
	System.out.println("Index of j is "+a.indexOf('j'));
	System.out.println(b.lastIndexOf('a','2'));
	System.out.println(a.replace('i', '_'));
}
}