package com.sasvi.collections.kavitha;

import java.util.Set;
import java.util.TreeSet;

import com.sasvi.datatypes.Student;

public class StudentTreeSetProgram {

	 public static void main(String[] args) {
		 StudentTreeSetProgram studentTreeSetProgram = new StudentTreeSetProgram();
		 TreeSet<Student> studentTreeSet = studentTreeSetProgram.createStudentsHashSet();
	 }

	private TreeSet<Student> createStudentsHashSet() {
		TreeSet<Student> students = new TreeSet<Student>();
		students.add(new Student(1, "kavitha", "cse"));
		
		students.add(new Student(2, "ravi", "cse"));
		
		students.add(new Student(3, "ram", "ece"));
		
		students.add(new Student(4, "sas", "ece"));
		
		
		
		return students;
		// TODO Auto-generated method stub
		
	}
}
