package com.my.practice;

public class CountPageFlips {
	public static int pageCount(int n, int p) {
//	     return Math.min(p/2, (n/2)-(p/2)); 
	    return Math.min(p/2, (n-p)/2); 
	      
	    // return (p/2 > (n-p)/2)? (n-p)/2: p/2; 
	      // System.out.print((p/2 > (n-p)/2)? (n-p)/2: p/2);
	      // return 0;
	     }

	public static void main(String[] args) {
		int n =pageCount(7, 5);
		System.out.println(n);
	}

}
