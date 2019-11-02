package hacs;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */
import java.awt.*;
import java.awt.event.*;

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class LowLevelCourseMenu extends CourseMenu {

	private static final String ASSIGMENT_CONTENT = "AssigmentContent";
	private static final String VIEW = "View";
	private static final String LOW_LEVEL_EXPERIMENT = "LowLevelExperiment";
	private static final String ASSIGNMENT = "Assignment";
	private static final String ADD = "Add";
	/**
	 * Adding serialization ID as CourseMenu implements serializable
	 */
	private static final long serialVersionUID = 3700067554247264677L;

	public LowLevelCourseMenu() {
	}

	void ShowMenu(Course theCourse) {
		setVisible(true);
	}

	void ShowAddButtons() {
		assignmentAddButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AssignmentAddButton_actionPerformed(e);
			}
		});
		assignmentAddButton.setText(ADD);
		assignmentAddButton.setBounds(new Rectangle(389, 54, 79, 29));
		optionAddButton.setText(ADD);
		optionAddButton.setBounds(new Rectangle(390, 125, 79, 29));
		this.getContentPane().add(assignmentAddButton, null);
		this.getContentPane().add(optionAddButton, null);
	}

	void ShowRadios() {
		assignmentRadiao.setText(ASSIGNMENT);
		assignmentRadiao.setBounds(new Rectangle(21, 55, 103, 26));
		this.getContentPane().add(assignmentRadiao, null);
		optionRadio.setText(LOW_LEVEL_EXPERIMENT);
		optionRadio.setBounds(new Rectangle(21, 128, 103, 26));
		this.getContentPane().add(optionRadio, null);
	}

	void ShowComboxes() {
		assignmentCombox.setBounds(new Rectangle(140, 57, 126, 22));
		optionCombo.setBounds(new Rectangle(137, 127, 126, 22));
		this.getContentPane().add(assignmentCombox, null);
		this.getContentPane().add(optionCombo, null);
		refresh();
	}

	void ShowViewButtons() {
		assignmentViewButton.setText(VIEW);
		assignmentViewButton.setBounds(new Rectangle(290, 54, 79, 29));
		assignmentViewButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AssignmentViewButton_actionPerformed(e);
			}
		});
		optionViewButton.setText(VIEW);
		optionViewButton.setBounds(new Rectangle(290, 124, 79, 29));
		this.getContentPane().add(assignmentViewButton, null);
		this.getContentPane().add(optionViewButton, null);
	}

	void ShowLabel() {
		assignmentContentLable.setText(ASSIGMENT_CONTENT);
		assignmentContentLable.setBounds(new Rectangle(23, 186, 432, 99));
		this.getContentPane().add(assignmentContentLable, null);
	}
}