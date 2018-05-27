import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnionSetGenericTest {
	
	Set<Integer> a;
	Set<Integer> b;
	Set<Integer> c;
	
	@Before
	public void setUp() throws Exception {
		a = new HashSet<Integer>();
		b = new HashSet<Integer>();
		c = new HashSet<Integer>();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		b = null;
		c = null;
	}
	
	@Test (expected = NullPointerException.class)
	public void testListaNull() {
		a = null;
		Union.<Integer>unionSetGeneric(a, b);
	}
	
	
}