package com.nit.hk.pojo;

public class Student {
	
	private int sno;
	private String sname;
	private String course;
	private double fee;
	private long mobile;
	private String email;
	private char gender;
	private boolean studying;
	
	public Student() {
		//no-op
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isStudying() {
		return studying;
	}

	public void setStudying(boolean studying) {
		this.studying = studying;
	}

	@Override
	public String toString() {
		
		return 	"\n  sno\t\t: " 	+ sno + 
				"\n  sname\t\t: " 	+ sname + 
				"\n  course\t: " 	+ course + 
				"\n  fee\t\t: " 	+ fee + 
				"\n  mobile\t: " 	+ mobile + 
				"\n  email\t\t: " 	+ email + 
				"\n  gender\t: " 	+ gender + 
				"\n  studying\t: "	+ studying ;
	}

}