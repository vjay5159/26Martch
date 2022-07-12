package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class setStudy {

	public static void main(String[] args)
	{
		HashSet h = new HashSet();
		
		h.add("vijay");
		h.add(12345);
		h.add(12.852f);
		h.add("vijay");
		h.add(null);
		h.add(null);
		h.add('A');
		
		System.out.println(h);
		System.out.println(h.size());
        System.out.println(h.contains("vijay"));
        System.out.println(h.contains("Vijay"));
        System.out.println(h.isEmpty());
        System.out.println(h.remove('A'));
        System.out.println(h);
        
        Iterator it = h.iterator();
       System.out.println("///////////////////"); 
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        System.out.println("++++++++++++++++++++++++++++");
        for(Object a:h)
        {
        	System.out.println(a);
        }
        System.out.println("---------------------------");
        
        Iterator ll = h.iterator();
        for(int b=0;b<=h.size()-1;b++ )
        {
        	System.out.println(h.);
        }
	}

}
