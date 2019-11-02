package hacs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class SolutionGradingDlg extends JDialog {
	
	private static final String OK = "OK";
	private static final String SOLUTION_FILE_NAME = "Solution File Name";
	private static final int WINDOW_WIDTH = 186;
	private static final int WINDOW_HEIGHT = 316;
	/**
	 * Adding serialization ID as JDialog implements serialization
	 */
	private static final long serialVersionUID = -2569190770834686363L;
	Solution theSolution;
	JLabel jLabel1 = new JLabel();
	JTextField tfGrad = new JTextField();
	JButton buttonOK = new JButton();
	JLabel labelSolutionFileName = new JLabel();

	public SolutionGradingDlg() {
		try {
			jbInit();
			setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
			setModal(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		jLabel1.setText(SOLUTION_FILE_NAME);
		jLabel1.setBounds(new Rectangle(23, 30, 121, 18));
		this.getContentPane().setLayout(null);
		tfGrad.setBounds(new Rectangle(25, 66, 100, 22));
		buttonOK.setText(OK);
		buttonOK.setBounds(new Rectangle(217, 67, 79, 29));
		buttonOK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonOK_actionPerformed(e);
			}
		});
		labelSolutionFileName.setBounds(new Rectangle(212, 34, 163, 18));
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(tfGrad, null);
		this.getContentPane().add(labelSolutionFileName, null);
		this.getContentPane().add(buttonOK, null);
	}

	void show(Solution solution) {
		theSolution = solution;
		tfGrad.setText("" + theSolution.getGradeInt());
		labelSolutionFileName.setText(theSolution.getSolutionFileName());
		setVisible(true);
	}

	void buttonOK_actionPerformed(ActionEvent e) {
		theSolution.theGrade = Integer.parseInt(tfGrad.getText());
		setVisible(false);
	}

}