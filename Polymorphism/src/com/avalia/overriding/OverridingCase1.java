package com.avalia.overriding;

public class OverridingCase1 {
	public int add() {
		return 1;
	}
}
 class childCase1 extends OverridingCase1 {
	public int add() {
		return 2;
	}
}
