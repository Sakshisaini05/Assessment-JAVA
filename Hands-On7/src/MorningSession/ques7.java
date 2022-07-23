package MorningSession;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ques7 {

	public static void main(String[] args) {
		TreeSet<String> ob=new TreeSet<>();
       ob.add("Red");
       ob.add("Blue");
       ob.add("Green");
       Iterator it=ob.iterator();
System.out.println("Reversed data : ");


Iterator<String> iterev = ob.descendingIterator();

       while(iterev.hasNext())

       {

  //      Object e=iterev.next();

        System.out.println(iterev.next());

	}
       System.out.println("Tree set data without reversing: ");
       while(it.hasNext())

       {

        Object e=it.next();

        System.out.println(e);

	}
       System.out.println("TreeSet contains green or not :"+ob.contains("Green"));
System.out.println("TreeSet contains Sakshi or not: "+ob.contains("Sakshi"));
}
}
