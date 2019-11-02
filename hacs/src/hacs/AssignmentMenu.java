package hacs;

import javax.swing.*;


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
abstract public class AssignmentMenu extends JDialog {
	/**
	 * Serialization ID as JDialog implements serializable
	 */
	private static final long serialVersionUID = -4446540636548918335L;
	
	private static final int WINDOW_WIDTH = 575;
	private static final int WINDOW_HEIGHT = 330;
	
	abstract void ShowMenu(Assignment ass, Person per);

	public AssignmentMenu() {
		setModal(true);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
}