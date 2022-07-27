import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() {
	Demo1 d=new Demo1();
	
	String ans=d.stringConcat("Hello","World" );
	assertEquals("HelloWorld",ans);
	}

}
