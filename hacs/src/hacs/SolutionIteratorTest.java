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
class SolutionIteratorTest {

	private static final String TEST_AUTHOR = "Test Author";
	Solution solution = new Solution();
	SolutionList solutionList = new SolutionList();
	
	@Test
	void testSolutionIterator() {
		System.out.println("Initialized Solution Iterator");
	}

	@Test
	void testSolutionIteratorSolutionList() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	void testMoveToHead() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		solutionIterator.moveToHead();
		assertEquals(-1, solutionIterator.getCurrentSolutionNumber());
	}

	@Test
	void testHasNext() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	void testNext() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next());
	}

	@Test
	void testNextString() {
		solution.setTheAuthor(TEST_AUTHOR);
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next(TEST_AUTHOR));
	}

	@Test
	void testRemove() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		int size = solutionIterator.solutionlist.size();
		int expectedSize = size-1;
		solutionIterator.next();
		solutionIterator.remove();
		assertEquals(expectedSize, solutionIterator.solutionlist.size());
	}

}
