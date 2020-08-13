package com.demo;

public class P5 {

	public static void main(String[] args) {
		test(5,10);
		test(6,7,8);
		test(8,9,2,3);
	}
	public static void test(int a, int b) {
		System.out.println(a+b);
	}
	public static void test(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void test(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}

}