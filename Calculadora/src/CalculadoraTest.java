import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


 class CalculadoraTest {

	@Test
	void testeSoma() {
		Calculadora c = new Calculadora();
		int resultEsperado = 25;
		
		int result = c.somar(9, 16);
		
		assertEquals(resultEsperado, result);
	}
	
	@Test
	void testeSubtracao() {
		Calculadora c = new Calculadora();
		int resultEsperado = 50;
		
		int result = c.sub(150, 100);
		
		assertEquals(resultEsperado, result);
	}
	
	@Test
	void testeMultiplicacao() {
		Calculadora c = new Calculadora();
		int resultEsperado = 100;
		
		int result = c.mult(2, 50);
		
		assertEquals(resultEsperado, result);
	}
	
	@Test
	void testeDivisao() {
		Calculadora c = new Calculadora();
		int resultEsperado = 25;
		
		int result = c.div(50,2);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void testeFloat() {
		Calculadora c = new Calculadora();
		float resultEsperado = (float) 12.5;
		
		float result = c.divF(50,4);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void testeDouble() {
		Calculadora c = new Calculadora();
		double resultEsperado = 1003120.3600000001;
		
		double result = c.multD(5000.60,200.60);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void testePotencia() {
		Calculadora c = new Calculadora();
		double resultEsperado = 243;
		
		double result = c.pow(3, 5);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void testeraizQuadrada() {
		Calculadora c = new Calculadora();
		double resultEsperado = 5;
		
		double result = c.raizQ(25);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void testeraizCubica() {
		Calculadora c = new Calculadora();
		double resultEsperado = 2;
		
		double result = c.raizCub(8);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void testePorcent() {
		Calculadora c = new Calculadora();
		float resultEsperado = 10;
		
		float result = c.porcent(10,100);
		
		assertEquals(resultEsperado, result);
	}
	
}
