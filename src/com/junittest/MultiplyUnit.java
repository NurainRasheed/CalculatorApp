package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyUnit {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		int output1=cal.multiply(4,2);
		assertEquals(8,output1);
	}

}
