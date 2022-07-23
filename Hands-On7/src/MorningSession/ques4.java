package MorningSession;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Vector<Employee> v= new Vector<>();
          v.add(new Employee("Ram",13,20000));
          v.add(new Employee("Shyam",14,25000));
          v.add(new Employee("Raju",15,29000));

		  Enumeration e = v.elements();

		    while(e.hasMoreElements()) {

		      System.out.println(e.nextElement());

		    }
          
        /*  Iterator<Employee> it= v.iterator();

          while(it.hasNext())

          {

          System.out.println(it.next());

          }*/

	}

}
