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
 * @version 2.0
 * 
 * update to Java 8
 */


/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class Solution {
	
	private static final String IS_NOT_REPORTED = "-1";
	private String theAuthor;
	private String solutionFileName;

	private Date theSubmitData = new Date();
	int theGrade;
	boolean reported = false;

	public Solution() {
	}

	@Override
	public String toString() {
		String string;
		string = theAuthor + "  " + solutionFileName + " Grade=" + getGradeInt() + "  ";
		if (isReported())
			string += "reported";
		else
			string += "not reported";

		return (string);
	}

	String getGradeString() {
		if (isReported())
			return "" + theGrade;
		else
			return IS_NOT_REPORTED;
	}

	int getGradeInt() {
		return theGrade;
	}

	public void setReported(boolean reported) {
		this.reported = reported;
	}

	public boolean isReported() {
		return reported;
	}
	
	public String getTheAuthor() {
		return theAuthor;
	}

	public void setTheAuthor(String theAuthor) {
		this.theAuthor = theAuthor;
	}
	
	public void setSolutionFileName(String solutionFileName) {
		this.solutionFileName = solutionFileName;
	}
	
	public String getSolutionFileName() {
		return solutionFileName;
	}

	public Date getTheSubmitData() {
		return theSubmitData;
	}

	public void setTheSubmitData(Date theSubmitData) {
		this.theSubmitData = theSubmitData;
	}
}