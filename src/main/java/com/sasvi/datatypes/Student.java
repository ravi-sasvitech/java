package com.sasvi.datatypes;

public class Student {
	private int number;
	private String name;
	private String branch;
	
	public Student(int number, String name, String branch) {
		super();
		this.number = number;
		this.name = name;
		this.branch = branch;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
