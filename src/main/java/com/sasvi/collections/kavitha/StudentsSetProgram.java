package com.sasvi.collections.kavitha;

import java.util.HashSet;
import java.util.Set;

import com.sasvi.datatypes.Student;

public class StudentsSetProgram {
	
	public static void main(String args[]) {
		createStudentsHashSet();
	}
	
	
	/**
	 * This method creates list with student objects 
	 * @return list
	 */
	public static Set<Student> createStudentsHashSet() {
		
		Set<Student> students = new HashSet<Student>();
		
		Student kavitha = new Student(1, "kavitha", "cse");
		students.add(kavitha);
		
		students.add(new Student(2, "ravi", "cse"));
		
		students.add(new Student(3, "ram", "ece"));
		
		students.add(new Student(4, "sas", "ece"));
		
		return students;
	}
	
	/**
	 * This method creates list with student objects 
	 * @return list
	 */
	public static Set<Student> createStudentsLinkedHashSet() {
		return null;

	}
	

}
