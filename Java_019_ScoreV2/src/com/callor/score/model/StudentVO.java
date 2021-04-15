package com.callor.score.model;

public class StudentVO {

	private String num;
	private String grade;
	private String name;
	private String address;
	private String dept;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "[학번=" + num + ", 학년=" + grade + ", 이름=" + name + ", 주소=" + address + ", 학과="
				+ dept + "]";
	}

	
	
}
