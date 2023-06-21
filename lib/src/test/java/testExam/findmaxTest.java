package testExam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findmaxTest {

	@Test
	void test() {
		assertEquals(4,Calculation.findMax(new int [] {1,3,4,2}));
		assertEquals(-1,Calculation.findMax(new int [] {-12,-1,-3,-4,-2}));
		}
	
	@Test
	void testDecision() {
		assertEquals(true, Calculation.decisionCoverage(true));
	}
	}


