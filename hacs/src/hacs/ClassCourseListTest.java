package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 1.0
 *
 */
class ClassCourseListTest {

	ClassCourseList classCourseList = new ClassCourseList();
	private static final String FILE_NAME = "CourseInfo.txt";
	private static final String EXPECTED_COURSE_STRING = "CSE870";
	
	@Test
	void testClassCourseList() {
		System.out.println("Initialized Class Course List");
	}

	@Test
	void testInitializeFromFile() throws IOException {
		classCourseList.initializeFromFile(FILE_NAME);
		assertEquals(3, classCourseList.size());
	}

	@Test
	void testFindCourseByCourseName() throws IOException {
		classCourseList.initializeFromFile(FILE_NAME);
		assertEquals(EXPECTED_COURSE_STRING, classCourseList.findCourseByCourseName(EXPECTED_COURSE_STRING).toString());
	}

}
