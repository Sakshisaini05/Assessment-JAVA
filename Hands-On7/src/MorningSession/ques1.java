//Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.
package MorningSession;

import java.util.ArrayList;

public class ques1 {

	public static void main(String[] args) {
		ArrayList<Number>arr=new ArrayList<Number>();
		arr.add(2);
		arr.add(8.2f);
		arr.add(9.66);
		//arr.add("Hello");
	System.out.println("Elements are: ");
		Object a[]=arr.toArray();
		for(Object x:a) {
			System.out.println(x);
		}
			

	}

}
