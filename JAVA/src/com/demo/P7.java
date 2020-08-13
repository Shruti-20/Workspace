package com.demo;
//Factorial using recursion
public class P7 {
	static int mul=1;
	public static void main(String[] args) {
		test(8);

	}
	public static void test(int n) {
		
		if(n>0) {
		mul = mul*n;
		}
		n--;
		if(n==0)
		{   
			System.out.println(mul);
			return;
		}
		test(n);
		
		
		
	}

}
