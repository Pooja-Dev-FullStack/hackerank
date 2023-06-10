package com.intv.ques;

public class Fibonacci {
	public void fibonacci() {
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b);
		System.out.print(b);
		for(int i=0;i<14;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			c=0;
		}
		
	}
	public static void main(String[] args) {
		Fibonacci fibonacci= new Fibonacci();
		fibonacci.fibonacci();
		
		
	}
	

}
