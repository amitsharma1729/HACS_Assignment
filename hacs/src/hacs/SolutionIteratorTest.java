package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionIteratorTest {

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
		solutionIterator.MoveToHead();
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
		solution.setTheAuthor("Test Author");
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next("Test Author"));
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
