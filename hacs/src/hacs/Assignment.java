package hacs;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */

import java.util.*;
import java.text.DateFormat;

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class Assignment {

	private String assignmentName;

	private Date dueDate = new Date();

	private boolean accepted = false;

	public Assignment() {
	}

	public Date getDueDate() {
		return dueDate;
	}

	protected String assignmentSpecification;

	protected SolutionList theSolutionList = new SolutionList();

	protected Solution suggestSolution = new Solution();

	public void setAssSpec(String theSpec) {
		this.assignmentSpecification = theSpec;
	}

	public boolean isOverDue() {
		Date today;
		today = new Date();
		if (today.after(this.dueDate)) {
			return true;
		} else {
			return false;
		}
	}

	public Solution addSolution() {
		Solution mySolution = new Solution();
		return mySolution;
	}

	//// add the theSolution to the Solutionlist
	public void addSolution(Solution theSolution) {
		theSolutionList.add(theSolution);
	}

	public void submitSolution() {
	}

	public void getSolutionList() {
	}

	/*
	 * return the solution of the give name
	 */
	public Solution getSolution(String studentname) {
		SolutionIterator iterator = getSolutionIterator();
		return (Solution) iterator.next(studentname);
	}

	public Solution getSugSolution() {
		return suggestSolution;
	}

	public SolutionIterator getSolutionIterator() {
		SolutionIterator theSolutionIterator = new SolutionIterator(theSolutionList);
		return theSolutionIterator;
	}

	public String toString() {
		return assignmentName;
	}

	public String getDueDateString() {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		return dateFormat.format(dueDate);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitAssignment(this);
		accepted = true;
	}

	public String getAssSpec() {
		return assignmentSpecification;
	}

	public SolutionList getTheSolutionList() {
		return theSolutionList;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isVisited() {
		return accepted;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

}