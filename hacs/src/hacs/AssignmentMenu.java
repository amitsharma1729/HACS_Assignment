package hacs;

import javax.swing.*;


/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

abstract public class AssignmentMenu extends JDialog {
	/**
	 * Serialization ID as JDialog implements serializable
	 */
	private static final long serialVersionUID = -4446540636548918335L;

	abstract void ShowMenu(Assignment ass, Person per);

	public AssignmentMenu() {
		setModal(true);
		setSize(575, 330);
	}
}