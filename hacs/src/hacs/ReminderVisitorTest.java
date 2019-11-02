package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 1.0
 *
 */
class ReminderVisitorTest {

	private static final String TEST_ASSIGNMENT = "Test Assignment";

	@Test
	void testReminderVisitor() {
		System.out.println("Initialized reminder visitor");
	}

	@Test
	void testReminderVisitorReminder() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		assertNotNull(reminderVisitor.getM_Reminder());
	}

	@Test
	void testVisitAssignment() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		Assignment assignment = new Assignment();
		assignment.setAssignmentName(TEST_ASSIGNMENT);
		assignment.setDueDate(new Date());
		reminderVisitor.visitAssignment(assignment);
		assertNotNull(reminderVisitor.getM_Reminder().listUpcoming);
	}

}
