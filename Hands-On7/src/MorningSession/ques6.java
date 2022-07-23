package MorningSession;

import java.util.HashSet;
import java.util.Iterator;


public class ques6 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet <String>ename=new HashSet<>();
		 ename.add("Sakshi Saini");
		 ename.add("Komal Saini");
		 ename.add("Gagan Saini");
		 ename.add("Sumit Sharma");
		 ename.add("Paras kumar");
		 
		 Iterator<String> it=ename.iterator();

	     while(it.hasNext())

	     {

	     System.out.println(it.next());

	     }
		
		 
	}

}
