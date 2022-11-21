package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions JUnit = new JUnitFunctions();
		String res = JUnit.AddStrings("Mahak ","Chamria");
		assertEquals ("Mahak Chamria",res);
	}

}
