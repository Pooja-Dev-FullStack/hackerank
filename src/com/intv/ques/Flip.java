package com.intv.ques;

import java.util.Scanner;

public class Flip {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        long n = sc.nextLong();
	        long outpi= ~(n | 0xFFFFFFFF00000000L);
	        System.out.println( ~(n | 0xFFFFFFFF00000000L)) ;
	        System.out.println(n | 0xFFFFFFFF00000000L);

	}

}
// 2147483647
