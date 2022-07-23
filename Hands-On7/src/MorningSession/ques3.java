package MorningSession;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector al = new Vector();
	    al.add("January"); 
	    al.add("February");
	    al.add("March");
	    al.add("April"); 
	    al.add("May");
	    al.add("June");
	    al.add("July"); 
	    al.add("August");
	    al.add("September");
	    al.add("October"); 
	    al.add("November");
	    al.add("December");
	    /*Object ab[] = al.toArray();

	    for(Object x: ab)

	    {

	     System.out.println(x);

	    }*/
	    Enumeration e = al.elements();

	    while(e.hasMoreElements()) {

	      System.out.println(e.nextElement());

	    }


	}

}
