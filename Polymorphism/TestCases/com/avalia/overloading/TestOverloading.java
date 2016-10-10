package com.avalia.overloading;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOverloading {
	private OverloadingCase1 case1;
	private OverloadingCase2 case2;
	private OverloadingCase3 case3;
	private OverloadingCase4 case4;
	private OverloadingCase5 case5;

	@Before
	public void setup() {
		case1 = new OverloadingCase1();
		case2 = new OverloadingCase2();
		case3 = new OverloadingCase3();
		case4 = new OverloadingCase4();
		case5 = new OverloadingCase5();
	}

	@Test
	public void test() throws Exception {
		assertEquals(4, case1.add(2,2));
		assertEquals(4, case2.add(2, 2));
		assertEquals("vivektiwari", case2.add("vivek", "tiwari"));
		assertEquals('i', case3.method(2));
		assertEquals('i', case4.method(2));
		assertEquals('s', case5.method("durga"));
		assertEquals('b', case5.method(new StringBuffer("durga")));
	}

}
