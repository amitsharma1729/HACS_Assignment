package hacs;

import java.util.ArrayList;
import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 update to Java 8
 */

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * Enum for courselevel
 */
enum COURSELEVEL {
	HIGH_LEVEL_COURSE(0),
	LOW_LEVEL_COURSE(1);
	
	private final int value;
	
	COURSELEVEL(final int value){
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class ClassCourseList extends ArrayList<Course> {

	/**
	 * Adding serial version as it implements ArrayList which is serializable
	 */
	private static final long serialVersionUID = 2105793156961922423L;

	private static final String DIRECTORY_LOCATION = "user.dir";
	private static final String FILE_NAME = "CourseInfo.txt";
	
	BufferedReader file;

	public ClassCourseList() {
	}

	//// initialize the list by reading from the file.
	void initializeFromFile(String theFileName) throws IOException {
		try {
			String strCourseName = null;
			// System.out.println(new File().getAbsolutePath());
			file = new BufferedReader(new FileReader(System.getProperty(DIRECTORY_LOCATION) + "//" + FILE_NAME));

			while ((strCourseName = file.readLine()) != null) {
				Course theCourse;
				theCourse = new Course(strCourseName, COURSELEVEL.HIGH_LEVEL_COURSE.getValue());
				add(theCourse);
			}
		} catch (Exception ee) {
			;
		} finally {
			file.close();
		}
	}

	Course findCourseByCourseName(String CourseName) {
		int nCourseCount = size();
		for (int i = 0; i < nCourseCount; i++) {
			Course theCourse;
			theCourse = (Course) get(i);
			if (theCourse.courseName.compareTo(CourseName) == COURSELEVEL.HIGH_LEVEL_COURSE.getValue())
				return theCourse;
		}
		return null;
	}

}