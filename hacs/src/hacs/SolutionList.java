package hacs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 *          Update to Java 8
 */

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 2.0 - Updated according to current Java standards
 *
 */
public class SolutionList extends ArrayList<Solution> {

	/**
	 * Adding serialization ID as it extends ArrayList
	 */
	private static final long serialVersionUID = 3946051444612734908L;

	public SolutionList() {
	}
	
	@Override
	public Iterator<Solution> iterator() {
		// TODO Auto-generated method stub
		return (SolutionIterator) super.iterator();
	}
}