package hacs;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */


/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class Student extends Person {

	public Student() {
		setType(PERSON_TYPE.STUDENT.getValue());
	}

	public CourseMenu createCourseMenu(Course theCourse, int theLevel) {

		if (theLevel == COURSELEVEL.HIGH_LEVEL_COURSE.getValue()) // 0: Highlevel defined in CourseSelectDlg.
		{
			setTheCourseMenu(new HighLevelCourseMenu());
		} else
		{
			setTheCourseMenu(new LowLevelCourseMenu());
		}
		return getTheCourseMenu();
	}

	@Override
	public boolean showMenu() {
		super.showMenu();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}