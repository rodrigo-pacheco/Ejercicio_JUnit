import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnionSetTest {
	
	Set a;
	Set b;
	Set c;
	
	@Before
	public void setUp() throws Exception {
		a = new HashSet();
		b = new HashSet();
		c = new HashSet();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		b = null;
		c = null;
	}
	
	@Test (expected = NullPointerException.class)
	public void TestNull(){
		a = null;
		Union.unionSet(a,b);
	}
	
	@Test
	public void TestSetVacio(){
		assertTrue("Fallo al unir Sets vacios", c.equals(Union.unionSet(a, b)));
	}
	
	
}