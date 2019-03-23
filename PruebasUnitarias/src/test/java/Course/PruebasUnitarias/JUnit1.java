package Course.PruebasUnitarias;

import static org.junit.Assert.*;
import org.junit.Test;
import com.qvision.calculadora.Calculator;

public class JUnit1 {

	@Test
	public void testSum() {
		Calculator firstSum = new Calculator();
		assertEquals(10, firstSum.add(8, 2));
	}
	
	@Test
	public void testSubs() {
		Calculator firstSubstraction = new Calculator();
		assertEquals(6, firstSubstraction.subs(8, 2));
	}
	
	@Test
	public void testMult() {
		Calculator firstMultiplication = new Calculator();
		assertEquals(16, firstMultiplication.mult(8, 2));
	}
	
	@Test
	public void testDiv() {
		Calculator firstDivition = new Calculator();
		assertEquals(4, firstDivition.div(8, 2));
	}

}
