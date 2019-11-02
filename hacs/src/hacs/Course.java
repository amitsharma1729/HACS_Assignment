package hacs;

import java.util.*;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0 Update to Java 8
 */

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class Course {
	String courseName;
	int numOfAssignment;
	int courseLevel;
	boolean accepted = false;

	public ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();

	public Course(String strCourse, int theLevel) {
		this.courseName = strCourse;

		// 0 HighLeve presentation 1 LowLevel Experiment
		this.courseLevel = theLevel;
		// this.AssList = NULL;
		this.numOfAssignment = 0;
	}

	public void AddAssignment(Assignment newAss) {
		assignmentList.add(newAss);
	}

	public String toString() {
		return courseName;
	}

	void accept(NodeVisitor visitor) {
		visitor.visitCourse(this);
		accepted = true;
	}

	public int getCourseLevel() {
		return courseLevel;
	}

	public boolean isVisited() {
		return accepted;
	}

}