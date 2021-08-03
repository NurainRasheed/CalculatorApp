package com.junittest;

public class Calculator {
	public void memoryClear() {
		System.out.println("Clear Memory");
	}
	public int add(int a ,int b) {
		return a + b;
	}
	public int square(int a) {
		return a * a;
	}
	public int multiply(int a, int b) {
		return a *b;
	}
	public void reset() {
		System.out.println("Reset");
	}
	public static void main(String args[]) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(1,2));
		System.out.println(cal.multiply(1,2));
	}
}
