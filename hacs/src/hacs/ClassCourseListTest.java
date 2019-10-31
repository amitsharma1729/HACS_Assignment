package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClassCourseListTest {

	ClassCourseList classCourseList = new ClassCourseList();
	@Test
	void testClassCourseList() {
		System.out.println("Initialized Class Course List");
	}

	@Test
	void testInitializeFromFile() {
		classCourseList.InitializeFromFile("CourseInfo.txt");
		assertEquals(3, classCourseList.size());
	}

	@Test
	void testFindCourseByCourseName() {
		String expectedCourse = "CSE870";
		classCourseList.InitializeFromFile("CourseInfo.txt");
		assertEquals(expectedCourse, classCourseList.FindCourseByCourseName(expectedCourse).toString());
	}

}
