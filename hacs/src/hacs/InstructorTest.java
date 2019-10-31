package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InstructorTest {

	Instructor instructor = new Instructor();

	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu = instructor.CreateCourseMenu(new Course("Test Course", 0), 0); //low level
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}

	@Test
	void testInstructor() {
		assertEquals(1, instructor.type);
	}

}
