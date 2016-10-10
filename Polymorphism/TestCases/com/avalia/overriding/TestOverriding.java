package com.avalia.overriding;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOverriding {
	
	private childCase1 case1;
	private childCase2 case2;

	@Before
	public void setup() {
		
		case1=new childCase1();
		case2=new childCase2();
	}

	@Test
	public void test() throws Exception {
		
		assertEquals(case1.add(), 2);
		assertEquals(case2.add(), "string");
	}

}
