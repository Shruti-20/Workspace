package com.demo;

public class P6 {

	public static void main(String[] args) {
		System.out.println("from main");
		test(55);

	}
	public static void test(int n) {
		
		if(n%2==1)
		{
			System.out.println(n);
		}
		if(n==35) {
			return;
		}
		n--;
		test(n);
	}

}

