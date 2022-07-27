import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testFindName() {
		 ArrayList al = new ArrayList<>();

		    al.add("Aditi"); //parameter Object

		    al.add("Sakshi");

		    al.add("Vishal");

		    al.add("Paras");

		    al.add("Raju");
          Employee e=new Employee();
          String ans=e.findName(al,"Sakshi");
          assertEquals("FOUND",ans);
          
          

	}

}
