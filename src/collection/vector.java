package collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector {

	public static void main(String[] args) 
	{
	    Vector<Object> v = new Vector<Object>();
	    
	    v.add(100);
	    v.add("vijay");
	    v.add("vijay");
	    v.add(12.25f);
	    v.add(null);
	    v.add(null);
	    
	    System.out.println(v); 
	    System.out.println(v.size());
	    System.out.println(v.indexOf("vijay"));
	    System.out.println(v.lastIndexOf("vijay"));
	    System.out.println(v.indexOf(null));
	    System.out.println("--------------");
	    System.out.println(v.contains(0));
	    
	    v.set(2, "kokate");
	    System.out.println(v);
	    v.remove(4);
	    System.out.println(v);
	    for(Object vr:v)
	    {
	    System.out.println(vr);
	    }
	    System.out.println(v.get(3));

	    Enumeration<Object> en = v.elements();
	    while(en.hasMoreElements())
	    {
	    	System.out.println(en.nextElement());
	    }
	}
}
