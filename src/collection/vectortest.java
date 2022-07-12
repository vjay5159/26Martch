package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectortest {

	public static void main(String[] args)
	{
	      Vector<Object> v= new Vector<>();
	      v.add(100);
	      v.add("vijay");
	      v.add("vijay");
	      v.add(null);
	      v.add(1233);
	      v.add(88.12f);
	      System.out.println(v);
	      System.out.println("-------------------");
	      System.out.println(v.contains("ijay"));
	      System.out.println("-------------------");
	      System.out.println(v.indexOf("vijay"));
	      System.out.println(v.lastIndexOf("vijay"));
	      System.out.println(v.get(3));
	      v.add(2, "Kokate");
	      System.err.println(v);
          v.remove(5);
          System.out.println(v);

	   for(Object a:v)
	   {
		   System.out.println(a);
	   }
	   
	   Iterator i = v.iterator();
	   
	   while (i.hasNext())
	   {
		   System.out.println(i.next());
	   }
	  
	   
	   ListIterator li= v.listIterator();
			   while(li.hasNext())
			   {
		          System.out.println(li.next());
			   }
			   
			   Enumeration en= v.elements();
			   while(en.hasMoreElements())
			   {
				   System.out.println(en.nextElement());
			   }
	}

}
