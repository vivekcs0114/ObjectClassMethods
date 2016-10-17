//Deep cloning Example

package com.avalia.methods;
class Cats {
	int j;
	public Cats(int j) {
		this.j = j;
	}
}
class Dogss implements Cloneable {
	Cats c;
	int i;
	public Dogss(Cats c, int i) {
		this.c = c;
		this.i = i;
	}
	public Object clone() throws CloneNotSupportedException {
		Cats c1 = new Cats(c.j);
		Dogss d = new Dogss(c1, i);
		return d;
	}
}
class DeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cats c = new Cats(20);
		Dogss d1 = new Dogss(c, 10);
		System.out.println(d1.i + "............." + d1.c.j);
		Dogss d2 = (Dogss) d1.clone();
		d2.i = 888;
		d2.c.j = 999;
		System.out.println(d1.i + "............." + d1.c.j);
	}
}
