package MorningSession;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ques5 {
	Set<String>H1=new HashSet<>();
	
       public  Set<String> saveCountryNames(String CountryName) {
		
		H1.add(CountryName);
		return H1;
       }
       public String getCountry(String CountryName) {
    	   Iterator<String> it=H1.iterator();

    	    while(it.hasNext())

    	    {

    	     String ans=it.next();

    	  return ans;}
    	    return null;
       }
       public static void main(String[] args) {
   		ques5 c=new ques5();
   		c.saveCountryNames("India");
   		c.saveCountryNames("USA");
   		c.saveCountryNames("Canada");
   		System.out.println(c.getCountry("Pakistan"));
   		System.out.println("Nepal");
            

   	}
	
       
	
	}

