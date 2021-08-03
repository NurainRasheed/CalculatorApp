package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddUnit {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		int output1=cal.add(5, 3);
		assertEquals(8,output1);
		
	}

}
