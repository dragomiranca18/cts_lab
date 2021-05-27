package ro.ase.cts.seminar13.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar13.Student;
import ro.ase.cts.seminar13.exceptions.StudentExceptionWrongValue;

class StudentTestCase {

	/*test fixtures*/
	Student student;
	String defualtName="Anonim";
	int defaultVarsta=18;
	int defaultNote[]= {};
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		student=new Student(defualtName,defaultVarsta,defaultNote);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}

	@Test
	void testStudentConstructorRight() {
		String studentName="Anca";
		int studentAge=22;
		int grades[]= {8,8,9};
		
		Student student=new Student(studentName,studentAge,grades);
		assertEquals(studentName, student.getNume(), "Name is not equal");
		assertEquals(studentAge, student.getVarsta(), "Age is not equal");
		assertEquals(grades, student.getNote(), "Grades are not equal");
	}
	
	@Test
	void testtudentConstructorRightNotNull() {
		int grades[]= {8,8,9};
		Student student=null;
		try {
			student=new Student("Anca",22,grades);
		}catch (Exception e) {
			fail("Constructorul nu trebuie sa arunce exceptie");
		}
		assertNotNull(student);
	}

	@Test(expected=StudentExceptionWrongValue.class)
	void testStudentSetVarstaErrorCondition() {
			student.setVarsta(-1);
			
	}
}
