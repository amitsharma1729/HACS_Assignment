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

public class ClassCourseList extends ArrayList<Course> {

	/**
	 * Adding serial version as it implements ArrayList which is serializable
	 */
	private static final long serialVersionUID = 2105793156961922423L;

	public ClassCourseList() {
	}

	//// initialize the list by reading from the file.
	void InitializeFromFile(String theFileName) {
		try {
			System.out.println("COurse---->");
			BufferedReader file;
			String strCourseName = null;
			//System.out.println(new File().getAbsolutePath());
			file = new BufferedReader(new FileReader(System.getProperty("user.dir") + "//CourseInfo.txt"));
			
			while ((strCourseName = file.readLine()) != null) {
				Course theCourse;
				theCourse = new Course(strCourseName, 0);
//      theCourse.CourseName= strCourseName;
				add(theCourse);
			}
		} catch (Exception ee) {
			;
		}
	}

	Course FindCourseByCourseName(String CourseName) {
		int nCourseCount = size();
		for (int i = 0; i < nCourseCount; i++) {
			Course theCourse;
			theCourse = (Course) get(i);
			if (theCourse.CourseName.compareTo(CourseName) == 0)
				return theCourse;
		}
		return null;
	}


}