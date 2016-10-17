package com.avalia.methods;

public class ToString {
	String name;
	int rollno;

	public ToString(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return name + "" + rollno;
	}

	public static void main(String[] args) {
		ToString obj = new ToString("vivek", 114);
		System.out.println(obj);
	}

}
