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
class InstructorTest {

	private static final String COURSE_TEXT = "Test Course";
	Instructor instructor = new Instructor();

	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu = instructor.createCourseMenu(new Course(COURSE_TEXT, 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}

	@Test
	void testInstructor() {
		assertEquals(1, instructor.getType());
	}

}
