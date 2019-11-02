package hacs;

import java.util.Iterator;
import java.util.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 *          update to Java 8
 */

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	public ReminderVisitor() {
	}

	public ReminderVisitor(Reminder reminder) {
		m_Reminder = reminder;
	}

	public void visitFacade(Facade facade) {
		CourseIterator courseList = new CourseIterator(facade.theCourseList);
		while (courseList.hasNext()) {
			Course course = (Course) courseList.next();
			course.accept(this);
		}
	}

	public void visitCourse(Course course) {
		Iterator<Assignment> assignmentList = course.assignmentList.listIterator();
		while (assignmentList.hasNext()) {
			Assignment assignment = (Assignment) assignmentList.next();
			assignment.accept(this);
		}
	}

	public void visitAssignment(Assignment assignment) {
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int ntoday = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.setTime(assignment.getDueDate());
		int nDueDate = calendar.get(Calendar.DAY_OF_YEAR);
		if (m_Reminder != null) {
			if (nDueDate <= (ntoday + 1) && nDueDate >= ntoday) /// upcoming
			{
				m_Reminder.listUpcoming.add("today is " + today.toString() + " " + assignment.getAssignmentName() + " Due Date is "
						+ assignment.getDueDateString());
			}
			if (nDueDate < ntoday) {
				// put to the
				m_Reminder.listOverdue.add(assignment.getAssignmentName() + " Due Date is " + assignment.getDueDateString());
			}
		}

	}

	public Reminder getM_Reminder() {
		return m_Reminder;
	}

	public void setM_Reminder(Reminder m_Reminder) {
		this.m_Reminder = m_Reminder;
	}


}