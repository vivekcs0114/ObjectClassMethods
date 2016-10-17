package com.avalia.methods;

public class GetClass {
	String name;
	int rollno;

	public GetClass(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		GetClass obj1 = new GetClass("abc", 123);
		Class<? extends GetClass> ct = obj1.getClass();
		System.out.println(ct.getName());
	}

}
