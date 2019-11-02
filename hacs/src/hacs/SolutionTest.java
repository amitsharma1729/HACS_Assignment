package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 1.0
 *
 */
class SolutionTest {

	private static final String EXPECTED_STRING = "Sample Author  Solution File Grade=0  not reported";
	private static final String SOLUTION_FILE = "Solution File";
	private static final String SAMPLE_AUTHOR = "Sample Author";
	Solution solution = new Solution();

	@Test
	void testSolution() {
		System.out.println("Solution Initialized");
	}

	@Test
	void testToString() {
		solution.setTheAuthor(SAMPLE_AUTHOR);
		solution.setSolutionFileName(SOLUTION_FILE);
		assertEquals(EXPECTED_STRING, solution.toString());
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
