package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	void testSolution() {
		System.out.println("Solution Initialized");
	}

	@Test
	void testToString() {
		solution.setTheAuthor("Sample Author");
		solution.setSolutionFileName("Solution File");
		assertEquals("Sample Author  Solution File Grade=0  not reported", solution.toString());
	}

	@Test
	void testGetGradeString() {
		assertEquals("-1", solution.getGradeString());
	}

	@Test
	void testGetGradeInt() {
		assertEquals(0, solution.getGradeInt());
	}

	@Test
	void testSetReported() {
		solution.setReported(true);
		assertTrue(solution.isReported());
	}

	@Test
	void testIsReported() {
		solution.setReported(true);
		assertTrue(solution.isReported());
	}


}
