package com.sasvi.collections;

import java.util.ArrayList;
import java.util.List;

import com.sasvi.datatypes.Student;

public class StudentListProgram {
	

	public static void main(String args[]) {
		
		StudentListProgram studentsListProgram = new StudentListProgram();
		
		List<Student> studentsList = studentsListProgram.createStudentsList();
		
		System.out.println("Students info :");
		
		studentsListProgram.printStudnetsInfo(studentsList);
		
	//	studentsListProgram.filterEceStudents(studentsList);
		
	
		//sortStudentsByBranch(students);
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
	
	
	public void printStudnetsInfo(List<Student> students) {
		
		// Printing students info using for each loop
		for(Student student : students) {
			System.out.println(student.getName());
			System.out.println(student.getNumber());
			System.out.println(student.getBranch());
		}
		
		
		// printing students info using index
		for(int i=0; i<students.size() ; i++) {
			Student student = students.get(i);
			System.out.println(student.getName());
			System.out.println(student.getNumber());
			System.out.println(student.getBranch());
		}
	}


	/**
	 * Takes students collection as input, creates a new list with ece students and returns it.
	 * 
	 * @param students
	 * @return
	 */

	public List<Student>  filterEceStudents(List<Student> students) {
		//filter ece students
		
		List<Student> eceStudents = new  ArrayList<Student>();
		
		for(Student student : students) {
			if(student.getBranch().equals("ece")) {
				eceStudents.add(student);
			}
		}
		return eceStudents;
	}
	
	/**
	 * Returns true if kavitha is presnet in the list
	 * @param students
	 * @return
	 */
	public boolean isSudentKavithaPresentUsingReturn(List<Student> students) {
		for(Student student : students) {
			if(student.getName().equals("kavitha")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns true if kavitha is present in the list
	 * @param students
	 * @return
	 */
	public boolean isSudentKavithaPresentUsingBreak(List<Student> students) {
		boolean result = false;
		for(Student student : students) {
			if(student.getName().equals("kavitha")) {
				result = true;
			}
		}
		return result;
	}
}
