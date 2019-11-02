package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 1.0
 *
 */
class AssignmentTest {
	
	Assignment assignment = new Assignment();
	Solution solution = new Solution();
	
	@Test
	void Assignment() {
		System.out.println("Created assignment object");
	}
	
	@Test
	void testSetDueDate() throws ParseException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		date = sdf.parse("2019/10/15");
		assignment.setDueDate(date);
		assertEquals(date, assignment.getDueDate());
	}

	@Test
	void testSetAssSpec() {
		assignment.setAssSpec(new String("hello"));
		assertEquals("hello", assignment.getAssSpec());
	}

	@Test
	void testIsOverDue() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		date = sdf.parse("2019/10/15");
		assignment.setDueDate(date);
		assertEquals(true, assignment.isOverDue());
	}

	@Test
	void testAddSolution() {
		solution.setTheAuthor("testStudent");
		assignment.addSolution(solution);
		assertEquals(1, assignment.getTheSolutionList().size());
	}

	@Test
	void testSubmitSolution() {
		System.out.println("Called submit solution");
	}

	@Test
	void testGetSolutionList() {
		System.out.println("Called get solution list");
	}

	@Test
	void testGetSolution() {
		solution.setTheAuthor("testStudent");
		assignment.addSolution(solution);
		assertEquals("testStudent", assignment.getSolution("testStudent").getTheAuthor());
	}

	@Test
	void testGetSugSolution() {
		assertTrue(assignment.getSugSolution() instanceof Solution);
	}

	@Test
	void testGetSolutionIterator() {
		SolutionIterator solutionIterator = assignment.getSolutionIterator();
		assertEquals(0, solutionIterator.solutionlist.size());
	}

	@Test
	void testToString() {
		String input = "Assignment String";
        assignment.setAssignmentName(input);
        assertEquals(input, assignment.toString());
	}

	@Test
	void testGetDueDateString() {
		Date sampledueDate = new Date();
		assignment.setDueDate(sampledueDate);
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		assertEquals(dateFormat.format(sampledueDate), assignment.getDueDateString());
	}

	@Test
	void testAccept() { 
		assignment.accept(new ReminderVisitor());
		assertTrue(assignment.isVisited());
	}

}
