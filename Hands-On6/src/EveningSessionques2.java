import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EveningSessionques2 {
	static void PrintAll(List<String>al) {
		  Iterator it=al.iterator();
		  while(it.hasNext()) {//it returns true if it object has data

			     Object x=it.next(); //it will return next element,initially first element

			 System.out.println("Arraylist data = " +x);

			    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> al = new ArrayList();
		  al.add("SAKSHI ");
		  al.add("VISHAL");
		  al.add("RAM");
		  PrintAll(al);
	}

}
