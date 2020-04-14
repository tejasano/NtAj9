package com.nt.vo;

public class StudentVO {
	private int sno;
	private String sname;
	private int m1,m2,m3;
	public StudentVO(){
		System.out.println("StudentVO:0-param constructor");
	}
	
	public StudentVO(int sno, String sname, int m1, int m2, int m3) {
	 System.out.println("StudentVO:5-param constructor");
		this.sno = sno;
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
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
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
}
