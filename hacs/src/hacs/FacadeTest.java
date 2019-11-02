package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author amitsharma
 * Date: 11/01/2019
 * @version 1.0
 *
 */
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
		facade.submitSolution(assignment, solution);
		assertEquals(1, assignment.getTheSolutionList().size());
	}

	@Test
	void testCreateUser() {
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.userType = UserInfoItem.USER_TYPE.Student;
		userInfoItem.strUserName = "pepe";
		facade.createUser(userInfoItem);
		assertTrue(facade.thePerson instanceof Student);
	}

	@Test
	void testCreateCourseList() throws IOException {
		facade.createCourseList();
		assertEquals(3, facade.theCourseList.size());
	}

	@Test
	void testAttachCourseToUser() throws IOException {
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.userType = UserInfoItem.USER_TYPE.Student;
		userInfoItem.strUserName = "pepe";
		facade.createUser(userInfoItem);
		facade.createCourseList();
		facade.attachCourseToUser();
		assertEquals(2, facade.thePerson.getCourseList().size());
	}


}
