package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class Instructor extends Person {
	public Instructor() {
		setType(PERSON_TYPE.INSTRUCTOR.getValue());
	}

	public CourseMenu createCourseMenu(Course theCourse, int theLevel) {
		if (theLevel == COURSELEVEL.HIGH_LEVEL_COURSE.getValue()) {
			setTheCourseMenu(new HighLevelCourseMenu());
		} else {
			setTheCourseMenu(new LowLevelCourseMenu());
		}
		return getTheCourseMenu();
	}

	public boolean showMenu() {
		super.showMenu();
		showAddButton();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}