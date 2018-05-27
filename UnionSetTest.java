import java.util.Vector;

import org.junit.After;
import org.junit.Before;

public class UnionSetTest {
	
	Vector a;
	Vector b;
	Vector c;
	
	@Before
	public void setUp() throws Exception {
		a = new Vector();
		b = new Vector();
		c = new Vector();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		b = null;
		c = null;
	}
}