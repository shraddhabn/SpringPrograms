package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentSddress;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSddress() {
		return studentSddress;
	}
	public void setStudentSddress(String studentSddress) {
		this.studentSddress = studentSddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSddress=" + studentSddress
				+ "]";
	}




}

