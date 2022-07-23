package Morning_Session;


import java.util.*;
import java.util.Map.Entry;


public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,String> ob=new HashMap<>();
		ob.put("Sakshi", "Ambala");
		ob.put("Paras","Chandigarh");
		ob.put("Komal", "Delhi");
		ob.put("Aarav","Mullana");
	
	
	Set<Entry<String, String>> set = ob.entrySet();
	Iterator<Entry<String, String>> it = set.iterator();
	Map.Entry<String, String> map;
	while (it.hasNext()) {
		 map = it.next();    

	if(map.getKey().equals("Sakshi")) {
		
		System.out.println("1) YES,It conatins key Sakshi");
		break;}

	}
	set=ob.entrySet();
	it=set.iterator();
	
	while (it.hasNext()) {
		 map = it.next();
	if(map.getValue().equals("Ambala")) {
		
		System.out.println("2) YES,Value Ambala is there");
		break;}

	}
	
	System.out.println("3) Itertor Loop: ");
	
	set=ob.entrySet();
	it=set.iterator();
	while (it.hasNext()) {
	 map = it.next();
	   System.out.println("   "+map); 

	    

	

	}
}
}
