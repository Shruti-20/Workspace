package com.demo;

public class P2 {

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println("main ends");
		test(12,56.5,'a');
		even(9);
		even(6);
		multiply(15,2);
		multiply(30,45);
		multiply(5,25);
		multiply(7,14
				);
		
	}
	
	public static void test(int a,double b,char i) {
		double d=a+b+i;
		System.out.println(d);
	}
	
	public static void even(int f) {
		if(f%2==0)
		{System.out.println(f + " is even");}
		else
		{System.out.println(f + " is odd"); 
		}
	}
	
	public static void multiply(int g,int h) {
		{System.out.println("multiplication of given number is:" +g*h);}
	}
	

}


