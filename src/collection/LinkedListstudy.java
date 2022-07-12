package collection;

import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListstudy {

	public static void main(String[] args)
	{
			LinkedList ll = new LinkedList();
			ll.add("acb");
			ll.add(100);
			ll.add('A');
			ll.add(100);
			ll.add(null);
			ll.add(null);
			ll.add("acb");
			
			System.out.println(ll);
			System.out.println(ll.size());
		     ll.remove();
		     System.out.println(ll);
	         ll.add(6, "kokate");
	         System.out.println(ll);
	         System.out.println(ll.isEmpty());
	         System.out.println(ll.get(4));
	         System.out.println(ll.getFirst());
	         System.out.println(ll.getLast());
	         System.out.println(ll.getClass());
             System.out.println(ll.lastIndexOf(100));
             System.out.println(ll.indexOf(100));
             System.out.println("-------------------");
            
             for(int i=0;i<=ll.size()-1;i++)
             {
            	 System.out.println(ll.get(i));
             }
             
             System.out.println("=========================");
             
             for(Object b:ll)
             {
            	 System.out.println(b);
             }
             System.out.println("++++++++++++++++++++++++++++++++");
            
             
             ListIterator litr = ll.listIterator();
             while(litr.hasNext())
             {
            	 System.out.println(litr.next());
             }
             
      
             
             
	}

}
