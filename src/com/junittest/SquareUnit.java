package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareUnit {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		int output1=cal.square(4);
		assertEquals(16,output1);
		
		
	}

}
