package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * @version 1.0
 *
 */
class StudentTest {

	private static final String CSE180 = "CSE180";
	Student student = new Student();

	@Test
	void testStudent() {
		assertEquals(0, student.getType());
	}

	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu = student.createCourseMenu(new Course(CSE180, COURSELEVEL.HIGH_LEVEL_COURSE.getValue()),
				COURSELEVEL.HIGH_LEVEL_COURSE.getValue());
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}

}
