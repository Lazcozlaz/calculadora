package calculadoras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void sumaEnteros() {
		System.out.println("Suma de enteros");
		Suma sum = new Suma(2,3);
		assertTrue(sum.suma()==5);
	}
	public void sumaNegativos() {
		System.out.println("Suma de negativos");
		Suma sum = new Suma(-2,-3);
		assertTrue(sum.suma()==-5);
	}
	public void sumaMixto() {
		System.out.println("Suma de mixtos");
		Suma sum = new Suma(2,-3);
		assertTrue(sum.suma()==-1);
	}
}
