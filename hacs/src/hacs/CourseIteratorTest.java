package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseIteratorTest {

	ClassCourseList classCourseList = new ClassCourseList();
	
	@Test
	void testCourseIterator() {
		System.out.println("Initialized CourseIterator");
	}
	
	@Test
	void testCourseIteratorList() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertEquals(1, courseIterator.getTheCourseList().size());
	}

	@Test
	void testHasNext() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertTrue(courseIterator.hasNext());
	}

	@Test
	void testNext() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertNotNull(courseIterator.next());
	}

	@Test
	void testRemove() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		courseIterator.next();
		courseIterator.remove();
		assertEquals(0, courseIterator.getTheCourseList().size());
	}

	@Test
	void testNextString() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertNotNull(courseIterator.next("Test Course"));
	}

}
