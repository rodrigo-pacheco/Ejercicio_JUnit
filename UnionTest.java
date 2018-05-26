import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.lang.NullPointerException;


public class UnionTest {
	
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

	@Test
	public void testHappyPath1elem() {
		a.add(1);
		b.add(2);
		c.add(1);
		c.add(2);
		assertTrue("Fallo al unir vectores", c.equals(Union.union(a, b)));
	}
	
	@Test
	public void testHappyPath2elemns() {
		a.add(1);
		a.add(2);
		b.add(3);
		b.add(4);
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		assertTrue("Fallo al unir vectores", c.equals(Union.union(a, b)));
	}
}