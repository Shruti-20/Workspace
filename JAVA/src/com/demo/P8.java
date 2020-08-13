package com.demo;

public class P8 {
//Factorial using for loop
	public static void main(String[] args) {
		test();
			
	}
	   
	public static void test( ) {
		int a=1;
		
		for(int n=8;n>0;n--) {
			a = a*n;
		}
		System.out.println(a);
	}

}