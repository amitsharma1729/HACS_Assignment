package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacadeTest {
	
	Facade facade = new Facade();

	@Test
	void testFacade() {
		System.out.println("Initialized facade object");
	}

	@Test
	void testSubmitSolution() {
		Assignment assignment = new Assignment();
		Solution solution = new Solution();
		facade.SubmitSolution(assignment, solution);
		assertEquals(1, assignment.getTheSolutionList().size());
	}

	@Test
	void testCreateUser() {
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.UserType = UserInfoItem.USER_TYPE.Student;
		userInfoItem.strUserName = "pepe";
		facade.CreateUser(userInfoItem);
		assertTrue(facade.thePerson instanceof Student);
	}

	@Test
	void testCreateCourseList() {
		facade.CreateCourseList();
		assertEquals(3, facade.theCourseList.size());
	}

	@Test
	void testAttachCourseToUser() {
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.UserType = UserInfoItem.USER_TYPE.Student;
		userInfoItem.strUserName = "pepe";
		facade.CreateUser(userInfoItem);
		facade.CreateCourseList();
		facade.AttachCourseToUser();
		assertEquals(2, facade.thePerson.GetCourseList().size());
	}


}
