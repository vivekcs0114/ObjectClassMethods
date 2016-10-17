package com.avalia.methods;

public class Equals {
	String name;
	int rollno;

	public Equals(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		try {
			Equals o = (Equals) obj;
			if (name.equals(o.name) && rollno == o.rollno) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;

		}

	}

	public static void main(String[] args) {
		Equals obj1 = new Equals("vivek", 114);
		Equals obj2 = obj1;
		Equals obj3 = new Equals("vivek tiwari", 114);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
	}

}
