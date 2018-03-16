package SumDivisor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumDivisorTest {

	@Test
	void testSumDivisor() {
		SumDivisor sumDivisor = new SumDivisor();
		assertEquals(28,sumDivisor.sumDivisor(12));
	}

}
