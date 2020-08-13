package com.demo;

public class P4 {

	public static void main(String[] args) {
		int a=sum(10,20);
		int b=multiply(5,10);
		System.out.println(a);
		System.out.println(b);


	}
	
	public static int sum(int a, int b) {
		int sum=0;

		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
		}
		return sum;

		
	}
	
	public static int multiply(int c, int d) {
		int a=1;
		for(int i=c;i<=d;i++)
		{
			if(i%2==1)
			{
				a=a*i;
			}
		}
		return a;
	}

}
