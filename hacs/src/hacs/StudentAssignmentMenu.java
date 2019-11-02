package hacs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

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
public class StudentAssignmentMenu extends AssignmentMenu {

	private static final String SOLUTION = "Solution";
	private static final String J_TEXT_FIELD1 = "jTextField1";
	private static final String SUGGESTED_SOLUTION = "Suggested Solution";
	private static final String GRADE = "Grade";
	private static final String J_LABEL8 = "jLabel8";
	private static final String J_LABEL9 = "jLabel9";
	private static final String SUBMIT = "Submit";
	private static final String CANCEL = "Cancel";
	private static final String J_LABEL4 = "jLabel4";
	private static final String DUE_DATE = "Due Date";
	private static final String J_LABEL2 = "jLabel2";
	private static final String ASSIGNMENT = "Assignment : ";
	/**
	 * Adding serialization ID as AssignmentMenu is serializable
	 */
	private static final long serialVersionUID = -5046209341775753329L;
	//// class AssignmentMenu
	private boolean boolSubmit = false;
	private Solution theSolution;
	private Assignment theAssignment;

	JLabel lAssignmentName = new JLabel();
	JLabel lDueDate = new JLabel();
	JTextField tbSolution = new JTextField();
	JLabel lSuggestedSolution = new JLabel();
	JLabel lGrade = new JLabel();
	JButton bSubmit = new JButton();
	JButton bCancel = new JButton();

	JLabel jLabel1 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel6 = new JLabel();
	JLabel jLabel7 = new JLabel();

	public StudentAssignmentMenu() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		jLabel1.setText(ASSIGNMENT);
		jLabel1.setBounds(new Rectangle(20, 36, 91, 18));
		this.getContentPane().setLayout(null);
		lAssignmentName.setText(J_LABEL2);
		lAssignmentName.setBounds(new Rectangle(258, 35, 282, 18));
		jLabel3.setText(DUE_DATE);
		jLabel3.setBounds(new Rectangle(21, 81, 92, 18));
		lDueDate.setText(J_LABEL4);
		lDueDate.setBounds(new Rectangle(254, 82, 294, 18));
		jLabel5.setText(SOLUTION);
		jLabel5.setBounds(new Rectangle(24, 128, 93, 18));
		tbSolution.setText(J_TEXT_FIELD1);
		tbSolution.setBounds(new Rectangle(251, 127, 211, 22));
		jLabel6.setText(SUGGESTED_SOLUTION);
		jLabel6.setBounds(new Rectangle(24, 174, 117, 18));
		jLabel7.setText(GRADE);
		jLabel7.setBounds(new Rectangle(23, 224, 41, 18));
		lSuggestedSolution.setText(J_LABEL8);
		lSuggestedSolution.setBounds(new Rectangle(259, 169, 201, 18));
		lGrade.setText(J_LABEL9);
		lGrade.setBounds(new Rectangle(258, 226, 41, 18));
		bSubmit.setText(SUBMIT);
		bSubmit.setBounds(new Rectangle(476, 124, 79, 29));
		bSubmit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bSubmit_actionPerformed(e);
			}
		});
		bCancel.setText(CANCEL);
		bCancel.setBounds(new Rectangle(475, 164, 79, 29));
		bCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bCancel_actionPerformed(e);
			}
		});
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(jLabel3, null);
		this.getContentPane().add(jLabel5, null);
		this.getContentPane().add(jLabel6, null);
		this.getContentPane().add(lAssignmentName, null);
		this.getContentPane().add(lDueDate, null);
		this.getContentPane().add(tbSolution, null);
		this.getContentPane().add(jLabel7, null);
		this.getContentPane().add(lSuggestedSolution, null);
		this.getContentPane().add(lGrade, null);
		this.getContentPane().add(bSubmit, null);
		this.getContentPane().add(bCancel, null);
	}

	/*
	 * check if the student has already had a solution or not. if not , create a new
	 * solution for the student. after showing the solution attatch the soluiton;
	 */
	public void ShowMenu(Assignment assignment, Person thePerson) {
		theAssignment = assignment;
		SolutionIterator theIter = theAssignment.getSolutionIterator();
		theSolution = (Solution) theIter.next(thePerson.getUserName());
		if (theSolution == null) {
			tbSolution.setText("");
			lGrade.setText("-1");
		} else {
			tbSolution.setText(theSolution.getSolutionFileName());
			lGrade.setText(theSolution.getGradeString());

		}

		lAssignmentName.setText(theAssignment.getAssignmentName());
		lDueDate.setText(theAssignment.getDueDate().toString());
		lSuggestedSolution.setText(theAssignment.suggestSolution.getSolutionFileName());

		setVisible(true);

		if (boolSubmit == true) {
			if (theSolution == null) {
				theSolution = new Solution();
				theAssignment.addSolution(theSolution);
			}
			theSolution.setTheAuthor(thePerson.getUserName());
			theSolution.setSolutionFileName(tbSolution.getText());
			theSolution.setTheSubmitData(new Date());
		}
	}

	void bSubmit_actionPerformed(ActionEvent e) {
		boolSubmit = true;
		setVisible(false);
	}

	void bCancel_actionPerformed(ActionEvent e) {
		boolSubmit = false;
		setVisible(false);
	}

}