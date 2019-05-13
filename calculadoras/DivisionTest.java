package calculadoras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void DivisionEnteros() {
		System.out.println("division de enteros");
		Multiplicacion m = new Multiplicacion(6,2);
		assertTrue(m.multiplicacion()==3);
	}
	public void DivisionNegativos() {
		System.out.println("division de negativos");
		Multiplicacion m = new Multiplicacion(-6,-3);
		assertTrue(m.multiplicacion()==2);
	}
	public void DivisionMixto() {
		System.out.println("division de mixtos");
		Multiplicacion m = new Multiplicacion(-6,3);
		assertTrue(m.multiplicacion()==-2);
	}
}
