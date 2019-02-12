import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest2 {
	private Calculadora calcu;
	
	@Before
	public void creaCalculadora() {
		Calculadora calcu = new Calculadora(20, 10);
	}
	
	@After
	public void borrarCalculadora() {
		calcu = null;
	}
	
	@Test
	public void testSuma() {
		int resultat = calcu.suma();
		assertEquals(30,resultat);
	}

	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultat = calcu.resta();
		assertEquals(10,resultat);
	}

	@Test
	public void testMultiplica() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultat = calcu.multiplica();
		assertEquals(200,resultat);
	}

	@Test
	public void testDivisio() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultat = calcu.divisio();
		assertEquals(2,resultat);
	}
	
	@Test
	public void testException() {
		try {
			Calculadora calcu = new Calculadora(20, 10);
			int resultat = calcu.divisio();
			fail("falla s'hauria de haver llancat excepcio");
		}
		catch(ArithmeticException e) {
			//prova excepcio
		}
	}
	@Test
	public void testResta2() {
		Calculadora calcu = new Calculadora(34, 22);
		boolean resultat = calcu.resta2();
		assertTrue(resultat);
		
		calcu = new Calculadora(22, 56);
		resultat = calcu.resta2();
		assertFalse(resultat);
	}
	@Test
	public void testDivideix2() {
		Calculadora calcu = new Calculadora(20, 0);
		Integer resultat = calcu.divideix2();
		assertNull(resultat);
		
		calcu = new Calculadora(20, 5);
		int resultat2 = calcu.divideix2();
		assertEquals(4, resultat2);
		assertNotNull(resultat2);
	}

}
