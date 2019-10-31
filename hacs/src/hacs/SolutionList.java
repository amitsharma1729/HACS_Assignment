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

public class SolutionList extends ArrayList<Solution> {

	public SolutionList() {
	}
	
	@Override
	public Iterator<Solution> iterator() {
		// TODO Auto-generated method stub
		return (SolutionIterator) super.iterator();
	}
}