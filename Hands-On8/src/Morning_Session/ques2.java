package Morning_Session;

import java.util.*;
import java.util.Map.Entry;

 public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       Properties p = new Properties();
		p.put("Haryana", "Chandigarh");
     //  p.setProperty("Haryana","Chandigarh");
      // p.setProperty("Punjab","Chandigarh" );
      // p.setProperty("Himachal Pradesh", "Shimla");
       //p.setProperty("Uttar Pradesh","Lucknow");
      
       Set<Entry<Object,Object>>st=p.entrySet();
       for(Entry<Object, Object> it: st)

       {

       System.out.println(it.getKey()+" ->"+it.getValue());

       }
	}

}
