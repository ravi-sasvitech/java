package com.sasvi.collections.kavitha;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.sasvi.datatypes.Student;

public class StudentsSetProgram {
	
	public static void main(String args[]) {
		
		StudentsSetProgram studentSetProgram = new StudentsSetProgram();
		Set<Student> studentsSet = studentSetProgram.createStudentsHashSet();
		System.out.println("Students info: ");
		
		studentSetProgram.printStudnetsInfo(studentsSet);
		
//		studentSetProgram.filterEceStudents(studentsSet);
		
		//sortStudentsByBranch(studentsSet);
		
		
	}

	/**
	 * This method creates set with student objects 
	 * @return set
	 */
	public Set<Student> createStudentsHashSet() {
		
		Set<Student> students = new HashSet<Student>();
		
		students.add(new Student(1, "kavitha", "cse"));
		
		students.add(new Student(1, "kavitha", "cse"));
		
		students.add(new Student(2, "ravi", "cse"));
		
		students.add(new Student(3, "ram", "ece"));
		
		students.add(new Student(4, "sas", "ece"));
		
		return students;
	}
	
	public void printStudnetsInfo(Set<Student> students) {
		
		// Printing students info using for each loop
				for(Student student : students) {
					System.out.println(student);
			     }
	}
	
	/**
	 * Takes students collection as input, creates a new set with ece students and returns it.
	 * 
	 * @param students
	 * @return
	 */

	public Set<Student> filterEceStudents(Set<Student> students) {
		//filter ece students
		
		Set<Student> eceStudents = new  HashSet<Student>();
		
		for(Student student : students) {
			if(student.getBranch().equals("ece")) {
				eceStudents.add(student);
			}
		}
		return eceStudents;
	}
	
	
//	private Set<Student> sortStudentsByBranch(Set<Student> studentsSet) {
//		
//		List<Student> studentList = new ArrayList<>(studentsSet);
//		
//		Comparator<Student> departmentComparator = Comparator.comparing(Student::getBranch);
//		
//		
//		return null;
//		// TODO Auto-generated method stub
//	
//	}

}
