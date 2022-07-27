import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {

	@Test
	void testCheckPalindrome() {
		Demo2 d=new Demo2();
		boolean ans=d.CheckPalindrome("MOM");
		assertEquals(true,ans);
		ans=d.CheckPalindrome("MADAM");
		assertEquals(true,ans);
	}

}
