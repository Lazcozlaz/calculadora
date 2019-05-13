package calculadoras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicacionTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void MultiplicacionEnteros() {
		System.out.println("Multiplicacion de enteros");
		Multiplicacion m = new Multiplicacion(2,3);
		assertTrue(m.multiplicacion()==6);
	}
	public void MultiplicacionNegativos() {
		System.out.println("Multiplicacion de negativos");
		Multiplicacion m = new Multiplicacion(-2,-3);
		assertTrue(m.multiplicacion()==6);
	}
	public void sumaMixto() {
		System.out.println("Multiplicacion de mixtos");
		Multiplicacion m = new Multiplicacion(-2,3);
		assertTrue(m.multiplicacion()==-6);
	}
}
