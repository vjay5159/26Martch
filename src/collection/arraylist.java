package collection;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("vijay");
		a.add("kokate");
		a.add('A');
		a.add(123);
		a.add("vijay");
		a.add(123.456f);
		a.add(null);
		
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.indexOf("vijay"));
		System.out.println(a.indexOf(null));
		System.out.println(a.lastIndexOf("vijay"));
		a.set(2, 'v');
		System.out.println(a);
		a.set(3, 77700);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println("==================");
		System.out.println(a.contains("vija"));
	    System.out.println(a.get(4));
	    System.out.println(a);
	    Object remove;
		a.remove(4);
		System.out.println(a);
		
		for(Object b:a)
		{
			System.out.println(b);
		}
		
		for(int i=a.size()-1;i>=0;i--)
		{
			System.out.println(a.get(i));
		}
				
		
		
		
		
		

	}

}
