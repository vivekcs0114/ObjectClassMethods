
/* Unambiguous problem*/

package com.avalia.overloading;

public class OverloadingCase1 {

	public float add(int a, float b) {
		return a + b;
	}

	public int add(int a, int b) {
		return a + b;
	}
}
