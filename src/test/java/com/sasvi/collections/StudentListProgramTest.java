package com.sasvi.collections;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.sasvi.datatypes.Student;



public class StudentListProgramTest {
	
	StudentListProgram studentsListProgram = new StudentListProgram();
	
	@Test
	public void isSudentKavithaPresentUsingReturn() {
		// Prepare input data
		List<Student> students = createStudentsList();
		// call the method to test
		boolean result = studentsListProgram.isSudentKavithaPresentUsingBreak(students);
		// Verify the result
		Assert.assertTrue( result);
	}
	
	
	/**
	 * This method creates list with student objects 
	 * @return list
	 */
	public List<Student> createStudentsList() {
		List<Student> students = new ArrayList<Student>();
		
		Student kavitha = new Student(1, "kavitha", "cse");
		students.add(kavitha);
		
		students.add(new Student(2, "ravi", "cse"));
		
		students.add(new Student(3, "ram", "ece"));
		
		students.add(new Student(4, "sas", "ece"));
			
		return students;
	}

}
