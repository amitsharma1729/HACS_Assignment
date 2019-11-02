package hacs;

import java.util.Iterator;

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
public class SolutionIterator implements Iterator<Solution> {
	private static final int INITIAL_NUMBER = -1;

	SolutionList solutionlist;

	/// CurrentSolutionNumber: point to the location before the first element
	int currentSolutionNumber = -1;

	public SolutionIterator() {
	}

	public SolutionIterator(SolutionList thesolutionlist) {
		solutionlist = thesolutionlist;
		moveToHead();
	}

	public void moveToHead() {
		currentSolutionNumber = INITIAL_NUMBER;
	}

	public boolean hasNext() {
		if (currentSolutionNumber >= solutionlist.size() - 1)
			return false;
		else
			return true;
	}

	public Solution next() {
		if (hasNext() == true) {
			currentSolutionNumber++;
			return solutionlist.get(currentSolutionNumber);
		} else {
			return null;
		}
	}

	public Object next(String userName) {
		Solution theSolution;
		theSolution = (Solution) next();
		while (theSolution != null) {
			if (userName.compareTo(theSolution.getTheAuthor()) == 0) {
				return theSolution;
			}
			theSolution = (Solution) next();
		}
		return null;
	}

	public void remove() {
		solutionlist.remove(currentSolutionNumber);
	}

	public int getCurrentSolutionNumber() {
		return currentSolutionNumber;
	}

}