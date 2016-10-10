/* Exception is not consider in overloading*/

package com.avalia.overloading;

import java.io.IOException;

public class OverloadingCase2 {

	public int add(int a, int b)throws Exception {
		return a + b;
	}

	public String add(String a, String b)throws IOException {
		return a + b;
	
	}
}
