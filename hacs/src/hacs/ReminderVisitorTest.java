package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class ReminderVisitorTest {

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
		assignment.setAssignmentName("Test Assignment");
		assignment.setDueDate(new Date());
		reminderVisitor.visitAssignment(assignment);
		assertNotNull(reminderVisitor.getM_Reminder().listUpcoming);
	}

}
