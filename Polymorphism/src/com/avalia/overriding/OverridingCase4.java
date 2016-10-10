/* attempting to assign weaker access specifier*/


package com.avalia.overriding;

public class OverridingCase4 {
	 void method() {
		System.out.println("public");
	}
}

class childCase4 extends OverridingCase4 {
	public void method() {
		 System.out.println("public");
	}
}
