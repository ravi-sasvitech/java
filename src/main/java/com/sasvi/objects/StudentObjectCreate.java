package com.sasvi.objects;

import com.sasvi.datatypes.Student;

public class StudentObjectCreate {
	
	public static void main() {
		
		// Create student object with default constructor
		
		Student kavitha = new Student(1, "kavitha", "cse");
		
		
		
		// Create student object with parameterized constructor
		Student kavitha2 = new Student();
		kavitha2.setNumber(1);
		kavitha2.setName("kavitha");
		kavitha2.setBranch("cse");
		
		
		// print kavitha object using system.out.println
		System.out.println(kavitha.getName());
		System.out.println(kavitha.getNumber());
		System.out.println(kavitha.getBranch());
		
		
		// print kavitha2 object using system.out.println
		System.out.println(kavitha2.getName());
		System.out.println(kavitha2.getNumber());
		System.out.println(kavitha2.getBranch());
	}

}
