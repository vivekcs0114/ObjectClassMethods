/* covarrient return type is allowed in overriding*/

package com.avalia.overriding;

public class OverridingCase2 {
	public Object add() {
		return "object";
	}
}

class childCase2 extends OverridingCase2 {
	public String add() {
		return "string";
	}
}
