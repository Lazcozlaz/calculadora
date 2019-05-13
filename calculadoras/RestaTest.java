package calculadoras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestaTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void sumaEnteros() {
		System.out.println("Resta de enteros");
		Resta r = new Resta(2,3);
		assertTrue(r.resta()==5);
	}
	public void restaNegativos() {
		System.out.println("Resta de negativos");
		Resta r = new Resta(-2,-3);
		assertTrue(r.resta()==1);
	}
	public void sumaMixto() {
		System.out.println("Resta de mixtos");
		Resta r = new Resta(-2,3);
		assertTrue(r.resta()==-5);
	}
}
