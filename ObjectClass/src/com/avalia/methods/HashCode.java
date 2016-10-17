package com.avalia.methods;

public class HashCode {
	String name;
	int rollno;

	public HashCode(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public int hashCode() {
		return rollno;
	}

	public static void main(String[] args) {
		HashCode obj1 = new HashCode("vivek", 102);
		System.out.println(obj1);
		HashCode obj2 = new HashCode("vivek", 100);
		System.out.println(obj2);
	}

}
