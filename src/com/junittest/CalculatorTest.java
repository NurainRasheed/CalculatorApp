package com.junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static Calculator cal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 cal=new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cal=null;
	}

	@Before
	public void setUp() throws Exception {
		cal.memoryClear();
	}

	@After
	public void tearDown() throws Exception {
		cal.reset();
	}

	@Test
	public void testAdd() {
		int output1=cal.add(5, 3);
		assertEquals(8,output1);
	}

	@Test
	public void testSquare() {
		int output1=cal.square(4);
		assertEquals(16,output1);
	}

	@Test
	public void testMultiply() {
		int output1=cal.multiply(4,2);
		assertEquals(8,output1);
	}

}
