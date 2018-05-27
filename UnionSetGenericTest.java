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
	
	@Test
	public void testHappyPath() {
		a.add(1);
		a.add(2);
		b.add(3);
		b.add(4);
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		assertTrue("Fallo al unir sets con mas de un elemento", c.equals(Union.<Integer>unionSetGeneric(a, b)));
	}
	
	@Test
	public void testElementosRepetidos() {
		a.add(1);
		b.add(1);
		b.add(2);
		c.add(1);
		c.add(2);
		assertTrue("Elementos repetidos", c.equals(Union.<Integer>unionSetGeneric(a, b)));
	}
	
	@Test
	public void testListasConNulls() {
		a.add(null);
		b.add(1);
		b.add(null);
		c.add(null);
		c.add(1);
		assertTrue("Nulls en las listas", c.equals(Union.<Integer>unionSetGeneric(a, b)));
	}
	
	@Test
	public void testListasVacias() {
		assertTrue("Sets vacios", c.equals(Union.<Integer>unionSetGeneric(a, b)));
	}
}