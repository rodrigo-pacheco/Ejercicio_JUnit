import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class UnionTest {
	
	/*Estos son los test fixture*/
	Vector<Integer> v1;
	Vector<Integer> v2;
	Vector<Integer> v3;
	
	/*Metodo para preparar el test*/
	@Before
	public void setUp()
	{
		v1 = new Vector<Integer>();
		v2 = new Vector<Integer>();
		v3 = new Vector<Integer>();
	}
	
	/*Método ejecutado al finalizar cada test*/
	@After
	public void tearDown(){
		v1 = null;
		v2 = null;
		v3 = null;
	}
	
	
	@Test public void primerTest{
		v1.add(1);
		v2.add(2);
		v3.add(1);
		v3.add(2);
		assertTrue("Ha fallado al intentar unir dos vectores", c.equals(Union.union(a, b)));
		}
	}
}