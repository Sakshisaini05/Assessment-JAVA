package Morning_Session;

import java.util.*;
import java.util.Map.Entry;

public class ques3 {

	public static void main(String[] args) {
		Map<Integer,String>ContactList=new HashMap<>();
		ContactList.put(958792856,"Ram");
		ContactList.put(783465289,"Aarav");
		ContactList.put(646288888,"Gagan");
		ContactList.put(766899779,"Paras");
		Set<Entry<Integer, String>> set = ContactList.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		Map.Entry<Integer, String> map;
		while (it.hasNext()) {
			 map = it.next();    

		if(map.getKey().equals(766899779)) {
			
			System.out.println("1) YES,It conatins key ");
			break;}

		}
		set=ContactList.entrySet();
		it=set.iterator();
		
		while (it.hasNext()) {
			 map = it.next();
		if(map.getValue().equals("Ram")) {
			
			System.out.println("2) YES,Value is there");
			break;}

		}
		
		System.out.println("3) Itertor Loop: ");
		
		set=ContactList.entrySet();
		it=set.iterator();
		while (it.hasNext()) {
		 map = it.next();
		   System.out.println("   "+map); 

		    

		

		}		

	}

}
