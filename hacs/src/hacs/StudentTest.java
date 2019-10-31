package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	Student student = new Student();

	@Test
	void testStudent() {
		assertEquals(0, student.type);
	}

	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu = student.CreateCourseMenu(new Course("CSE180", 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}

}
