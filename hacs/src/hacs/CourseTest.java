package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * @version 1.0
 *
 */
class CourseTest {

	Course course = new Course("TestCourse", 1);

	@Test
	void testCourse() {
		System.out.println("Course initialized");
		String expcetedCourse = "TestCourse";
		int expectedLevel = 1;
		assertEquals(expcetedCourse, course.toString());
		assertEquals(expectedLevel, course.getCourseLevel());
	}

	@Test
	void testAddAssignment() {
		Assignment assignment = new Assignment();
		course.AddAssignment(assignment);
		assertEquals(1, course.assignmentList.size());
	}

	@Test
	void testToString() {
		String expectedString = "TestCourse";
		assertEquals(expectedString, course.toString());
	}

	@Test
	void testAccept() {
		course.accept(new ReminderVisitor());
		assertTrue(course.isVisited());
	}

}
