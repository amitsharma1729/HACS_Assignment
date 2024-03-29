package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * @version 1.0
 *
 */
class ListIteratorTest {

	@Test
	void testListIterator() {
		ArrayList<Object> testList = new ArrayList<>();
		testList.add(1);
		ListIterator listIterator = new ListIterator(testList);
		assertEquals(1, listIterator.getTheList().size());
	}

	@Test
	void testHasNext() {
		ArrayList<Object> testList = new ArrayList<>();
		testList.add(5);
		ListIterator listIterator = new ListIterator(testList);
		assertTrue(listIterator.hasNext());
	}

	@Test
	void testNext() {
		ArrayList<Object> testList = new ArrayList<>();
		testList.add(10);
		ListIterator listIterator = new ListIterator(testList);
		assertNotNull(listIterator.next());
	}

	@Test
	void testRemove() {
		ArrayList<Object> testList = new ArrayList<>();
		testList.add(2);
		ListIterator listIterator = new ListIterator(testList);
		listIterator.next();
		listIterator.remove();
		assertEquals(0, listIterator.getTheList().size());
	}

}
