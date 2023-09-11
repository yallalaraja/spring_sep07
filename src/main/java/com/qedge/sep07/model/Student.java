package com.qedge.sep07.model;

public class Student {
	private String stuId;
	private String firstName;
	private String lastName;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getFirstName() {
		return firstName;
	}
	public Student() {
		super();
	}
	public Student(String stuId, String firstName, String lastName) {
		super();
		this.stuId = stuId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Student(String stuId, String firstName) {
		super();
		this.stuId = stuId;
		this.firstName = firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public void setXyz(Student st) {
		this.stuId = st.getStuId();
		this.firstName = st.getFirstName();
		this.lastName = st.getLastName();
	}
	
}
