package hacs;

import javax.swing.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * 
 * @author mjfindler
 * @version 2.0
 * 
 * Update to Java 8
 */

/**
 * 
 * @author amitsharma Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class SolutionMenu extends JDialog {

	/**
	 * Adding serialization ID as JDialog implements serializable
	 */
	private static final long serialVersionUID = 4095964584582810424L;

	public SolutionMenu() {
	}

	void showMenu(Solution theSolution) {
		setVisible(true);
	}

}
